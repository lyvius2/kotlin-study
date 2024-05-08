package advanced.lec06

fun main() {
    val num = 3
    num.toSuperString() // "Int : 3"

    val str = "ABC"
    str.toSuperString() // "String : ABC"

    val numbers = listOf(1, 2f, 3.0)
    numbers.filterIsInstance<Float>()   // [2f]
}

fun checkStringList(data: Any) {
    // data 가 List 인지 확인
    if (data is MutableList<*>) {
        val element: Any? = data[0]
        data.add(2)
    }
}

//fun <T> T.toSuperString() {
//    println("${T::class.java.name}: $this")
//}

inline fun <reified T> T.toSuperString() {
    println("${T::class.java.name}: $this")
}

inline fun <reified T> List<*>.hasAnyInstanceOf(): Boolean {
    return this.any { it is T }
}