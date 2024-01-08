package cotlin.cls.scope

import cotlin.cls.etc.Person

fun main() {
    val strings = listOf("SONY", "SEGA")
    strings.map { str -> str.length }
        .filter { length -> length > 1 }
        .let(::println)

    val str = "play station 5"
    val length = str?.let { text -> println(text.uppercase())
        text.length
    }
    println(length)

    mutableListOf("one", "two", "three")
        .also { println("The list elements before adding new one: $it") }
        .add("four")

    val numbers = mutableListOf("one", "two", "three")
    println("The list elements before adding new one: $numbers")
    numbers.add("four")
}

fun printPerson(person: Person?) {
    if (person != null) {
        println(person.name)
        println(person.age)
    }
}

fun printPersonScopeFunction(person: Person?) {
    person?.let {
        println(it.name)
        println(it.age)
    }
}

// scope function : let, run, also, apply, with