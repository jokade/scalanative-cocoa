//     Project: scalanative-cocoa
//      Module: 
// Description: 
package bindgen

import bindgen.antlr.ObjectiveCParser.ClassInterfaceContext
import bindgen.antlr._
import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.antlr.v4.runtime.{ANTLRInputStream, CommonTokenStream}
import slogging.LazyLogging

object Parser {

  def parse(input: ANTLRInputStream) = {
    val lexer = new ObjectiveCLexer(input)

    val tokens = new CommonTokenStream(lexer)

    val parser = new ObjectiveCParser(tokens)

    val tree = parser.translationUnit()

    val walker = new ParseTreeWalker

    val listener = new Listener

    walker.walk(listener, tree)

    println(listener.classes)
  }

  class Listener extends ObjectiveCParserBaseListener with LazyLogging {
    private var _classes = Seq.empty[ClassInterface]
    private var _curClass: ClassInterface = _

    def classes = _classes

    override def enterTranslationUnit(ctx: ObjectiveCParser.TranslationUnitContext): Unit = {
//      logger.debug("entering translation unit {}",ctx.getRuleContext().getText)
    }

    override def enterClassInterface(ctx: ObjectiveCParser.ClassInterfaceContext): Unit = {
      logger.debug("processing class interface {}",ctx.classNameGeneric().className().getText)
      _curClass = ClassInterface(ctx)
//      _classes :+= ClassInterface(ctx)
    }

    override def exitClassInterface(ctx: ClassInterfaceContext): Unit = {
      _classes :+= _curClass
      _curClass = null
    }


    override def enterMethodDeclaration(ctx: ObjectiveCParser.MethodDeclarationContext): Unit = {
      logger.trace("entering method declaration {}",ctx.getText)
    }

    override def enterClassMethodDeclaration(ctx: ObjectiveCParser.ClassMethodDeclarationContext): Unit = {
      logger.trace("entering class method declaration {}",ctx.getText)
    }

    override def exitTranslationUnit(ctx: ObjectiveCParser.TranslationUnitContext): Unit = {
//      logger.debug("exiting translation unit {}",ctx.getRuleContext().getText)
    }
  }


  trait Node

  case class ClassInterface(name: String) extends Node
  object ClassInterface {
    def apply(ctx: ClassInterfaceContext): ClassInterface = ClassInterface(
      name = ctx.classNameGeneric().className().getText
    )
  }

  def preprocess(input: ANTLRInputStream): Unit = {
    val lexer = new ObjectiveCPreprocessorLexer(input)
    val tokens = new CommonTokenStream(lexer)
    val parser = new ObjectiveCPreprocessorParser(tokens)
    val tree = parser.objectiveCDocument()
    val preprocessor = new ObjectiveCPreprocessor(tokens)
    println(preprocessor.visit(tree))

  }
}
