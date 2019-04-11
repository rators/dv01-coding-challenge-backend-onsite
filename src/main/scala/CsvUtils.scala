import java.io.File

import com.github.tototoshi.csv.CSVReader
import com.github.tototoshi.csv._

case class CsvRow(grade: String, amount: Float, annualIncome: Float)

object CsvUtils {
  def load(path: String): Iterator[Map[String, String]] = {
    val csvFile = new java.io.File(getClass.getResource(path).toURI)
    val reader = CSVReader.open(csvFile)
    reader.iteratorWithHeaders
  }
}
