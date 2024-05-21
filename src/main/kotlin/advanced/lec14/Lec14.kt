package advanced.lec14

// 고차 함수
fun compute(num1: Int, num2: Int, op: (Int, Int) -> Int): Int {
    return op(num1, num2)
}

fun opGenerator(): (Int, Int) -> Int {
    return { a, b -> a + b }
}


// 확장 함수
fun Int.add(other: Long): Int = this + other.toInt()

fun main() {
    9.add(6L)

    val add = {a: Int, b: Int -> a + b}

    add.invoke(1, 2)
    add(1, 2)

    val plus = fun Int.(other: Long): Int = this + other.toInt()
    7.plus(2)
}