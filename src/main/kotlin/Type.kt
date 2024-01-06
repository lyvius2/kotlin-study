import jakarta.cls.JavaPerson

fun main() {
    val number1: Int? = 3
    val number2: Long = number1?.toLong() ?: 0L

    println(number1?.toLong() ?: (0L + number2))
    val javaPerson: JavaPerson = JavaPerson("아무개", 27)
    printAgeIfPerson(javaPerson)
    println("이름은 ${javaPerson.name}, 나이는 ${javaPerson.age}세입니다.")
    var str =
    """
        ABCD
        EFG
        ${javaPerson.age}
    """.trimIndent()

    println(str)
}

fun printAgeIfPerson(obj: Any?) {
    if (obj is JavaPerson) {
        println(obj.age)            // smart cast
        val javaPerson = obj as? JavaPerson
        println(javaPerson?.age ?: 11)
        return
    }
    println("!")
}


