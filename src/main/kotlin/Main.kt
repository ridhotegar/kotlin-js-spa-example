package com.atmecode

import kotlinx.browser.document
import kotlinx.html.*
import kotlinx.html.dom.append
import kotlinx.html.js.onClickFunction
import org.w3c.dom.HTMLDivElement

fun main() {
    val root = document.getElementById("root") as HTMLDivElement

    root.append {
        button {
            +"Click Me"
            onClickFunction = {
                repeat(10) {
                    root.append {
                        p { +"Hello World ${it + 1}" }
                    }
                }
            }
        }
    }
}