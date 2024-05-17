package advanced.lec08

class Person {
    lateinit var name: String

    val isKim: Boolean
        get() = this.name.startsWith("김")

    val maskingName: String
        get() = name[0] + (1 until name.length).joinToString("") { "*" }
}

fun main() {
    val p = Person()
    p.isKim
}