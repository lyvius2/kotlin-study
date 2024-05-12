package advanced.lec08

class Person(
    var name: String = "",
) {
    val isKim: Boolean
        get() = name.startsWith("김")

    val maskingName: String
        get() = name[0] + (1 until name.length).joinToString("") { "*" }
}