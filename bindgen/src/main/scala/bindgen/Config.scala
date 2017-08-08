//     Project: scalanative-cocoa
//      Module:
// Description:
package bindgen

import java.io.File

import bindgen.Config.{Mode, PreprocessorConfig}
import slogging.{LazyLogging, LogLevel}
import com.typesafe.config.ConfigFactory

case class Config(file: Option[File] = None,
                  mode: Mode.Value = Mode.Generate,
                  loglevel: LogLevel.Value = LogLevel.OFF,
                  preprocessor: PreprocessorConfig = PreprocessorConfig())

object Config extends LazyLogging {

  case class PreprocessorConfig(enable: Boolean = true,
                                loadImports: Boolean = true,
                                includeDirs: Seq[String] = Nil,
                                ignoreMissingFiles: Boolean = false,
                                mapIncludes: Iterable[(String,String)] = Nil,
                                outputFile: Option[File] = None)

  object Mode extends Enumeration {
    val Preprocess = Value
    val Generate = Value
  }

  def load(base: Config, configFile: File): Config = {

    import collection.JavaConverters._
    if(!configFile.canRead)
      logger.error(s"Cannot read config file $configFile")

    val conf = ConfigFactory.parseFile(configFile).withFallback(ConfigFactory.load()).resolve()

    def loadStringMap(path: String): Seq[(String,String)] = conf.getConfigList(path).asScala
      .flatMap(_.entrySet().asScala)
      .map( p => (p.getKey.stripPrefix("\"").stripSuffix("\""), p.getValue.render().stripPrefix("\"").stripSuffix("\"")))

    val mode = conf.getString("objc.bindgen.mode").toLowerCase match {
      case "generate" => Mode.Generate
      case "preprocess" => Mode.Preprocess
      case x =>
        logger.error(s"invalid mode: $x")
        ???
    }


    val mapIncludes = loadStringMap("objc.bindgen.preprocessor.mapIncludes")

    base.copy(
      file =
        if(conf.hasPath("objc.bindgen.file"))
          Some(new File(conf.getString("objc.bindgen.file")))
        else
          None,
      mode = mode,
      loglevel = LogLevel.withName( conf.getString("objc.bindgen.loglevel") ),
      preprocessor = base.preprocessor.copy(
        enable = conf.getBoolean("objc.bindgen.preprocessor.enable"),
        loadImports = conf.getBoolean("objc.bindgen.preprocessor.loadImports"),
        includeDirs = conf.getStringList("objc.bindgen.preprocessor.includeDirs").asScala,
        ignoreMissingFiles = conf.getBoolean("objc.bindgen.preprocessor.ignoreMissingFiles"),
        mapIncludes = mapIncludes,
        outputFile =
          if(conf.hasPath("objc.bindgen.preprocessor.outputFile"))
            Some(new File(conf.getString("objc.bindgen.preprocessor.outputFile")))
          else
            None
      )
    )

  }

}

