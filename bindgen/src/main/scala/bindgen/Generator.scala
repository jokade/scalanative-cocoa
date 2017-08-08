//     Project: scalanative-cocoa
//      Module: 
// Description: 
package bindgen

import java.io.{BufferedInputStream, File, FileInputStream}

import org.antlr.v4.runtime.ANTLRInputStream
import slogging.LazyLogging

object Generator extends LazyLogging {

  def run(config: Config): Unit = {
    generate(config.file.get)
  }

  private def generate(file: File): Unit = {
    if (!file.canRead)
      logger.error(s"Cannot open file $file")

    logger.debug("processing file {}", file)
    val input = new ANTLRInputStream(new BufferedInputStream(new FileInputStream(file)))

    generate(input)
//    Parser.preprocess(input)
  }

  private def generate(input: ANTLRInputStream): Unit = {
    Parser.parse(input)
  }

}
