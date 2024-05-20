package advanced.lec13

class Lec13 {
}

fun main() {
    // lambda
    compute(5, 3) { a, b -> a + b }

    // 익명함수
    compute(5, 3, fun(a: Int, b: Int): Int {
        return a + b
    })

    compute(5, 3, fun(a, b): Int = a + b)

    iterate(listOf(1, 2, 3, 4, 5), fun(num) {
        if (num == 3) {
            return
        }
        println(num)
    })

    iterate(listOf(20, 30, 40, 50, 60)) { num ->
        if (num != 40) {
            println(num)
            // return : 비지역적 반환, lambda에서는 return을 사용할 수 없다.
        }
        /// println(num)
    }

    println("ABC")
}

fun compute(num1: Int, num2: Int, op: (Int, Int) -> Int): Int {
    return op(num1, num2)
}

fun iterate(numbers: List<Int>, exec: (Int) -> Unit) {
    for (number in numbers) {
        exec(number)
    }
}