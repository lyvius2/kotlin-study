fun main() {
    repeat("Hello World!")
    repeat("Go to World~~ ", 5, false)
    repeat("NANANA", useNewLine = false)

    printNameAndGender(name = "walter", gender = "male")
    printAll("A", "B", "C")

    val array = arrayOf("D", "E", "F")
    printAll(*array)
}

fun max(a: Int, b: Int): Int =
    if (a > b) {
        a
    } else {
        b
    }

fun max2(a: Int, b: Int) = if (a > b) a else b

fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true): Unit {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}