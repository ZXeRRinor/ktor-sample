import kotlinx.html.*

fun HTML.index() {
    head {
        title("RSK_Example_1")
        meta {
            charset = "UTF-8"
        }
        meta {
            httpEquiv = "X-UA-Compatible"
            content = "IE=edge"
        }
        meta {
            name = "viewport"
            content = "width=device-width, initial-scale=1.0"
        }
        link {
            rel = "stylesheet"
            href = "/pages/index.css"
        }
    }
    body {
        div {
            classes = setOf("root")
            header {
                classes = setOf("header")
                h1 {
                    classes = setOf("header__title")
                    +"Пример для группы РСК-31"
                }
            }
            section {
                classes = setOf("cities")
                div {
                    classes = setOf("city")
                    h2 {
                        classes = setOf("city__title")
                        +"Город Самара"
                    }
                    img {
                        classes = setOf("city__image")
                        src = "/images/1280px-Samara_-_Port_(2008-07-13).jpg"
                        alt = "Здесь будет фото города"
                    }
                    button {
                        classes = setOf("city__button")
                        +"Показать информацию"
                    }
                    p {
                        classes = setOf("city__info")
                        +"Что-то о городе"
                    }
                }
            }
            footer {
                p {
                    +"Телефон для связи 68-78-05"
                }
            }
        }
        script(src = "/scripts/scripts.js") {}
    }
}