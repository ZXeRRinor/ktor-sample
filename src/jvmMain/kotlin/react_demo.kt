import kotlinx.html.*

fun HTML.reactDemo() {
    head {
    }
    body {

        div {
            id = "root"
        }
        script(src = "/static/sample-project.js") {}
    }
}