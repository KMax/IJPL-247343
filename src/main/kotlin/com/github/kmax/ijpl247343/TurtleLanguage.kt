package com.github.kmax.ijpl247343

import com.intellij.lang.Language

object TurtleLanguage : Language("Turtle", "text/turtle") {
    override fun getDisplayName(): String = "RDF 1.1 Turtle"
    private fun readResolve(): Any = TurtleLanguage
}