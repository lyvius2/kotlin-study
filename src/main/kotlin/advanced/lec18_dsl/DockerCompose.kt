package advanced.lec18_dsl

import kotlin.properties.Delegates

fun main() {
    val yml = dockerCompose {
        version { 3 }
    }

    println(yml.render("  "))
}

fun dockerCompose(init: DockerCompose.() -> Unit): DockerCompose {
    val dockerCompose = DockerCompose()
    //init(dockerCompose)
    dockerCompose.init()
    return dockerCompose
}

class DockerCompose {
    private var version: Int by Delegates.notNull()

    fun version(init: () -> Int) {
        version = init()
    }

    fun render(indent: String): String {
        val builder = StringBuilder()
        builder.appendNew("version: '$version'")
        return builder.toString()
    }
}

fun StringBuilder.appendNew(str: String, indent: String = "", times: Int = 0) {
    (1..times).forEach { _ -> this.append(indent) }
    this.append(str)
    this.append("\n")
}

fun String.addIndent(indent: String, times: Int = 0): String {
    val allIndent = (1..times).joinToString("") { indent }
    return this.split("\n")
        .joinToString("\n") { "$allIndent$it" }
}