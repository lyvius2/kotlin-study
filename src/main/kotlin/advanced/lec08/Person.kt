package advanced.lec08

class Person(
    private val name: String,
) {
    val isKim: Boolean
        get() = name.startsWith("김")

    val maskingName: String
        get() = name[0] + (1 until name.length).joinToString("") { "*" }
}