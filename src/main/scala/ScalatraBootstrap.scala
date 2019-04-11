import org.scalatra._
import javax.servlet.ServletContext

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    println("mounting")
    context.mount(new HelloWorldApp, "/*")
  }
}