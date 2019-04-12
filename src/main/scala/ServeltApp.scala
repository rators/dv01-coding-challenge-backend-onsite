import org.scalatra.ScalatraServlet
import play.api.libs.json.Json

final case class ExampleMessage(foo: String)

object ExampleMessage {
  implicit val format = Json.format[ExampleMessage]
}

class ServeltApp extends ScalatraServlet {
  get("/hello") {
    val message = ExampleMessage("hello")
    Json.toJson(message)
  }

  before() {
    contentType = "application/json"
  }
}
