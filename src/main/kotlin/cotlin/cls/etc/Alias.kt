package cotlin.cls.etc

import cotlin.cls.dto.PersonDto
import cotlin.cls.etc.alpha.printHelloWorld as printHelloWorldA
import cotlin.cls.etc.beta.printHelloWorld as printHelloWorldB

data class Person(
    val name: String,
    val age: Int
)

class Console(
    private val manufacturer: String,
    private val console: String
) {
    operator fun component1(): String {
        return this.manufacturer
    }

    operator fun component2(): String {
        return this.console
    }
}

fun main() {
    printHelloWorldA()
    printHelloWorldB()

    val person = Person("아무개", 120)
    val (name, age) = person
    println("${name}, $age")

    val console = Console("SONY", "PlatStation4")
    val (company, con) = console
    println("${company} : ${con}")

    val numbers = listOf(1, 2, 3, 4)
    numbers.map {number -> number + 1}.forEach {println(it)}

    for (number in numbers) {
        if (number == 2) {
            break
        }
        println(number)
    }

    // break와 동일한 효과
    run {
        numbers.forEach { number ->
            if (number == 2) {
                return@run
            }
            println(number)
        }
    }

    // continue와 동일한 효과
    run {
        numbers.forEach { number ->
            if (number == 1) {
                return@forEach
            }
            println(number)
        }
    }
}

typealias AMap = Map<String, PersonDto>