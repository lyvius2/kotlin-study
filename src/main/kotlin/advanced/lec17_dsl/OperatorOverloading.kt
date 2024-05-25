package advanced.lec17_dsl

class OperatorOverloading {
}

data class Point(
    val x: Int,
    val y: Int,
) {
    fun zeroPointSymmetry(): Point = Point(-x, -y)
}

fun main() {
    val point = Point(20, -10)
    println(point.zeroPointSymmetry())
}