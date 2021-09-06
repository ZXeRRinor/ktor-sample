import io.ktor.application.*
import io.ktor.html.*
import io.ktor.http.*
import io.ktor.http.content.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import kotlinx.html.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "127.0.0.1") {
        routing {
            get("/") {
                call.respondHtml(HttpStatusCode.OK, HTML::index)
            }
            get("/react_demo") {
                call.respondHtml(HttpStatusCode.OK, HTML::reactDemo)
            }
            static("/") {
                resources()
            }
            static("/static") {
                resources()
            }
        }
    }.start(wait = true)
}