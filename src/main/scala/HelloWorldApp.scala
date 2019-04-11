import org.scalatra.ScalatraServlet
import play.api.libs.json.Json

final case class Message(foo: String)

object Message {
  implicit val format = Json.format[Message]
}

class HelloWorldApp extends ScalatraServlet {
  get("/hello") {
    val message = Message("hello")
    Json.toJson(message)
  }

  before() {
    contentType = "application/json"
  }
}
