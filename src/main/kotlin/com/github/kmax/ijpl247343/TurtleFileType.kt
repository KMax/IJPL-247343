package com.github.kmax.ijpl247343

import com.intellij.openapi.fileTypes.LanguageFileType

class TurtleFileType : LanguageFileType(TurtleLanguage) {
    companion object {
        val INSTANCE = TurtleFileType()
    }

    override fun getName() = "Turtle"
    override fun getDefaultExtension() = "ttl"
    override fun getDescription() = "RDF 1.1 Turtle"
    override fun getIcon() = null
}