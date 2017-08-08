//     Project: scalanative-cocoa
//      Module: 
// Description: 
package bindgen

import java.io.File
import java.nio.file.Files

import bindgen.Config.Mode
import slogging.{LazyLogging, LogLevel, LoggerConfig, PrintLoggerFactory}

object Main extends LazyLogging {

  LoggerConfig.onError = (level: LogLevel.Value, src: String, msg: String) => {
    System.exit(1)
  }

  def main(args: Array[String]): Unit = {
    cmdlineParser.parse(args,Config()) match {
      case Some(config) =>
        LoggerConfig.factory = PrintLoggerFactory()
        LoggerConfig.level = config.loglevel
        if(config.file.isEmpty) {
          logger.error("No input file specified")
          ???
        }
        config.mode match {
          case Mode.Generate =>
            Generator.run(config)
          case Mode.Preprocess =>
            Preprocessor.run(config)
        }
      case None =>
    }
  }

  val cmdlineParser = new scopt.OptionParser[Config]("objc-bindgen") {
    head("objc-bindgen")

    opt[File]('c',"config")
      .action( (x, c) => Config.load(c,x) )
      .text("Load configuration from the specified HOCON file")

    opt[Unit]("run-preprocessor")
      .action( (x, c) => c.copy(mode = Mode.Preprocess))
      .text("Run preprocessor on the specified file, print the result to stdout and exit")

    opt[Boolean]("load-imports")
      .action( (x, c) => c.copy(preprocessor = c.preprocessor.copy(loadImports = x)) )
      .text("Set to 'true' to include imported files during preprocessing (default: true)")

    opt[String]("loglevel")
      .action( (x , c) => c.copy(loglevel = LogLevel.withName(x)) )
      .text("Sets the logging level (OFF, ERROR, WARN, INFO, DEBUG, TRACE)")

    opt[File]("preprocessor-output")
      .action( (x, c) => c.copy(preprocessor = c.preprocessor.copy(outputFile = Some(x))))
      .text("Write the preprocessor output to this file (default: print output to stdout)")

    arg[File]("[file]").optional().action( (x,c) => c.copy(file = Some(x)))
  }



}
