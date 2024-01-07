package cotlin.cls.functional.array

fun main() {
    val fruits = listOf(
        Fruit(1, "사과", 1_000, 1_200),
        Fruit(2, "사과", 1_200, 1_250),
        Fruit(3, "사과", 1_200, 1_700),
        Fruit(4, "사과", 1_500, 1_550),
        Fruit(5, "바나나", 3_000, 2_000),
        Fruit(6, "바나나", 3_200, 3_300),
        Fruit(7, "바나나", 2_500, 3_000),
        Fruit(8, "수박", 10_000, 11_000)
    )

    fruits.count()
    val fruitsBySorted = fruits.sortedBy { fruit -> fruit.currentPrice }
    for (fruit in fruitsBySorted) {
        println(fruit)
    }

    val appleMap: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }
        .filter { (key, value) -> key != "수박" }
    for (apple in appleMap.entries) {
        println(apple)
    }

    val currentPriceMap: Map<Long, Long> = fruits.associateBy({fruit -> fruit.id}, {fruit -> fruit.factoryPrice})
    for (price in currentPriceMap.entries) {
        println(price)
    }
}

private fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
    return fruits.filter(filter)
}