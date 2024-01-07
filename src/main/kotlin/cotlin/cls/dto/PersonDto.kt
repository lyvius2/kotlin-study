package cotlin.cls.dto

fun main() {
    val person1: PersonDto = PersonDto("아무개", 29)
    val person2: PersonDto = PersonDto("아무개", 29)
    println(person1 == person2)
    println(person1 === person2)
    println(person1)
}
data class PersonDto (
    val name: String,
    val age: Int
)