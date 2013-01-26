package org.powerscala.log.writer

import org.powerscala.log.LogRecord
import org.powerscala.log.formatter.Formatter

/**
 * @author Matt Hicks <mhicks@outr.com>
 */
object ConsoleWriter extends Writer {
  def write(record: LogRecord, formatter: Formatter) = System.out.print(formatter.format(record))
}
