import react.dom.render
import kotlinx.browser.document
import kotlinx.browser.window
import kotlin.js.*

fun main() {
    window.onload = {
        render(document.getElementById("root")) {
            child(Welcome::class) {
                attrs {
                    name = "Kotlin/JS"
                }
            }
        }
    }
}
