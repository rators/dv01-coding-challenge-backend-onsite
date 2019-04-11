object MainApp extends App {
  val resource = getClass.getResource("loans.csv")
  val data: Iterator[Map[String, String]] = CsvUtils.load("loans.csv")

}
