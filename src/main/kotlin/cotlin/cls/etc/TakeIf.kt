package cotlin.cls.etc

fun main() {
    println(getNumberOrNullV2(2))
    println(getNumberOrNullV2(0))

    println(getNumberOrNullV3(0))
    println(getNumberOrNullV3(2))
}

fun getNumberOrNullV2(number: Int): Int? {
    return number.takeIf { number -> number > 0 }
}

fun getNumberOrNullV3(number: Int): Int? {
    return number.takeUnless { number -> number <= 0 }
}