package cotlin.cls.lambda

import jakarta.cls.Fruit

fun main() {
    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_200),
        Fruit("사과", 1_500),
        Fruit("바나나", 3_000),
        Fruit("바나나", 3_200),
        Fruit("바나나", 2_500),
        Fruit("수박", 10_000)
    )

    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    val isApple2: (Fruit) -> Boolean = {fruit: Fruit -> fruit.name == "사과"}

    println(isApple(fruits[0]))
    println(isApple.invoke(fruits[1]))

    val apples = filterFruits(fruits, isApple)
    for (apple in apples) {
        println("${apple.name}, ${apple.price}")
    }

    val bananas = filterFruits(fruits) { fruit -> fruit.name == "바나나" }
    for ((idx, banana) in bananas.withIndex()) {
        println("${idx}, 가격은 ${banana.price} 입니다.")
    }

    val waterMelons = filterFruits(fruits) { it.name == "수박" }
    println(waterMelons.size)
}

private fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }
    return results
}