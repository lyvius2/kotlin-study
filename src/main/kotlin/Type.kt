import jakarta.cls.Person

fun main() {
    val number1: Int? = 3
    val number2: Long = number1?.toLong() ?: 0L

    println(number1?.toLong() ?: (0L + number2))
    val person: Person = Person("아무개", 27)
    printAgeIfPerson(person)
    println("이름은 ${person.name}, 나이는 ${person.age}세입니다.")
    var str =
    """
        ABCD
        EFG
        ${person.age}
    """.trimIndent()

    println(str)
}

fun printAgeIfPerson(obj: Any?) {
    if (obj is Person) {
        println(obj.age)            // smart cast
        val person = obj as? Person
        println(person?.age ?: 11)
        return
    }
    println("!")
}


