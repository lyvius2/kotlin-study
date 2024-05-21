package advanced.lec15

inline fun add(num1: Int, num2: Int): Int {
    return num1 + num2
}

inline fun repeat(times: Int, exec: () -> Unit) {
    for (i in 1..times) {
        exec()
    }
}

inline fun iterate(numbers: List<Int>, exec: (Int) -> Unit) {
    for (num in numbers) {
        exec(num)
    }
}

fun main() {
    val num1 = 2
    val num2 = 3
    val result = add(num1, num2)
    println(result)

    repeat(10) { println("Hello World!!!") }

    // inline 함수로 지정하면 람다식에서 return을 쓸 수 있지만, main함수를 return 하게 된다.
    iterate(listOf(1, 2, 3, 4, 5)) { num ->
        if (num == 3) {
            return
        }
        println(num)
    }
}