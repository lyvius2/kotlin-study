package advanced.lec25

class Lec25 {
}

fun main() {
    println(factorial(4))
}

fun factorial(n: Int): Int {
    return if (n <= 1) {
        1
    } else {
        n * factorial(n - 1)
    }
}

tailrec fun factorialV2(n: Int, curr: Int = 1): Int {
    return if (n <= 1) {
        curr
    } else {
        factorialV2(n - 1, n * curr)
    }
}