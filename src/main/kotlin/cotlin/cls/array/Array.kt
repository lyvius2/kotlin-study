package cotlin.cls.array

fun main() {
    val array = arrayOf(100, 200)

    for (i in array.indices) {
        println("${i} ${array[i]}")
    }

    displayArray(array)
    displayArray(array.plus(300))
}

fun displayArray(arr: Array<Int>) {
    for ((idx, value) in arr.withIndex()) {
        println("$idx, $value")
    }
}