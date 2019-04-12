
import com.github.tototoshi.csv.CSVReader
import com.github.tototoshi.csv._

object CsvUtils {
  def load(path: String): Iterator[Map[String, String]] = {
    val csvFile = new java.io.File(getClass.getResource(path).toURI)
    val reader = CSVReader.open(csvFile)
    reader.iteratorWithHeaders
  }
}
