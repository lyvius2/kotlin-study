package advanced.lec10

class PersonMap(map: Map<String, Any?>) {
    val name: String by map
    val age: Int by map
    val isAlive: Boolean by map
}

fun main() {
    val personMap = PersonMap(mapOf("name" to "ABC", "age" to 25))
    println(personMap.name)
    println(personMap.age)
    println(personMap.isAlive)
}