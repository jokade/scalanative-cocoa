//     Project: scalanative-cocoa
//      Module:
// Description:
package bindgen

import java.io._

import bindgen.antlr.{ObjectiveCPreprocessorLexer, ObjectiveCPreprocessorParser, ObjectiveCPreprocessorParserBaseListener}
import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.antlr.v4.runtime.{ANTLRInputStream, CharStream, CommonTokenStream}
import slogging.LazyLogging

import scala.collection.mutable

object Preprocessor extends LazyLogging {

  def run(config: Config): Unit =
    if(config.preprocessor.outputFile.isDefined) {
      val fout = new BufferedWriter(new FileWriter(config.preprocessor.outputFile.get))
      preprocess(config.file.get,fout,config)
      fout.close()
    }
    else {
      println( preprocess(config.file.get,config) )
    }

  def preprocess(entry: File, config: Config): StringBuffer = {
    val writer = new StringWriter()
    val listener = new PreprocessorListener(config,writer)
    preprocess(entry,listener,config)
    writer.close()
    writer.getBuffer
  }

  def preprocess(entry: File, writer: Writer, config: Config): PreprocessorListener =
    preprocess(entry,new PreprocessorListener(config,writer),config)

  def preprocess(entry: File, listener: PreprocessorListener, config: Config): PreprocessorListener = {
    if (!entry.canRead) {
      logger.error(s"Cannot open entry file '$entry'")
      ???
    }

    logger.info("preprocessing entry {}", entry)
    val input = new ANTLRInputStream(new BufferedInputStream(new FileInputStream(entry)))
    preprocess(input,listener,config)
  }

  def preprocess(entry: CharStream, listener: PreprocessorListener, config: Config): PreprocessorListener = {
    val lexer = new ObjectiveCPreprocessorLexer(entry)
    val tokens = new CommonTokenStream(lexer)
    val parser = new ObjectiveCPreprocessorParser(tokens)
    val tree = parser.objectiveCDocument()
    val walker = new ParseTreeWalker
    walker.walk(listener,tree)
    listener
  }

  class PreprocessorListener(config: Config, writer: Writer) extends ObjectiveCPreprocessorParserBaseListener {
    import config.preprocessor._

    private val _macros = mutable.Map.empty[String,MacroDef]

    private lazy val mapIncludesPatterns = mapIncludes.map(p => (p._1.r.pattern,p._2))

    override def enterPreprocessorImport(ctx: ObjectiveCPreprocessorParser.PreprocessorImportContext): Unit = {
      if(!loadImports)
        return

      val include = mapInclude( ctx.directive_text().getText.replaceAll("[<>]","") )

      findImport(include) match {
        case Some(f) =>
          loadImport(f)
        case None if ignoreMissingFiles=>
          logger.warn(s"could not load file '$include' in directories [${includeDirs mkString ", "}]")
        case _ =>
          logger.error(s"could not load file '$include' in directories [${includeDirs mkString ", "}]")
          ???
      }
    }


    override def enterPreprocessorDef(ctx: ObjectiveCPreprocessorParser.PreprocessorDefContext): Unit = {

    }

    override def enterPreprocessorDefine(ctx: ObjectiveCPreprocessorParser.PreprocessorDefineContext): Unit = {
      ctx match {
        case MacroDef(mdef) =>
          logger.trace(s"defining $mdef")
          _macros += mdef.name -> mdef
      }
    }

    override def enterCode(ctx: ObjectiveCPreprocessorParser.CodeContext): Unit = {
      writer.write(ctx.getText)
    }

    private def findImport(include: String): Option[File] = includeDirs
      .map(d => new File(d + "/" + include))
      .find(_.canRead)

    private def mapInclude(include: String): String = mapIncludesPatterns
      .collectFirst{
        case (pattern,replaceWith) if pattern.matcher(include).matches() =>
          pattern.matcher(include).replaceAll(replaceWith)
      } getOrElse include

    private def loadImport(include: File) = {
      logger.debug("importing {}",include)
    }

    case class MacroDef(name: String, value: String)
    object MacroDef {
      private val EmptyDefine = """\s*define\s+(\w+)\s*""".r
      private val SimpleDefine = """\s*define\s+(\w+)\s+(.+)""".r
      private val DefineWithArgs = """\s*define\s+(\w+)\s*\((.+?)\)\s*(.+)""".r

      def unapply(ctx: ObjectiveCPreprocessorParser.PreprocessorDefineContext): Option[MacroDef] = Some(ctx.getText match {
        case SimpleDefine(name,value) => MacroDef(name,value)
        case EmptyDefine(name) => MacroDef(name,"")
        case DefineWithArgs(name,args,value) => MacroDef(name,value)
      })
    }
  }
}
