package cotlin.cls.array

fun main() {
    val numbers = listOf(100, 200)
    val emptyList = emptyList<Int>()

    println(numbers[0])
    for (number in numbers) {
        println(number)
    }

    for ((idx, value) in numbers.withIndex()) {
        println("$idx, $value")
    }

    val numbers2 = mutableListOf(100, 200)
    numbers2.add(300)

    val numbers3 = setOf(100, 200)
}

private fun printNumbers(numbers: List<Int>) {

}
