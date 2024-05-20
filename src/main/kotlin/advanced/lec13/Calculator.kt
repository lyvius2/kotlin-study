package advanced.lec13

fun main() {
    val result: Int = calculate(7, 2, Operator.MINUS)
    println(result)
}

fun calculate(num1: Int, num2: Int, oper: Operator) = oper.calFun(num1, num2)

enum class Operator(
    private val oper: Char,
    val calFun: (Int, Int) -> Int,
) {
    PLUS('+', { x, y -> x + y }),
    MINUS('-', { x, y -> x - y }),
    MULTIPLY('*', { x, y -> x * y }),
    DIVIDE('/', { x, y ->
        if (y == 0) {
            throw IllegalArgumentException("$y 으로 나눌 수 없습니다.")
        }
        x / y
    }),
}