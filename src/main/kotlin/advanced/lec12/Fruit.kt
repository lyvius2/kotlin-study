package advanced.lec12

data class Fruit(
    val name: String,
    val price: Long
)

fun main() {
    val fruits = listOf(
        Fruit("Apple", 1000L),
        Fruit("Banana", 3000L),
    )

    val avg = fruits.asSequence()
        .filter { it.name == "Apple" }
        .map { it.price }
        .take(10_000)
        .average()
}