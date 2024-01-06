import jakarta.cls.Money

fun main() {
    val money1 = Money(2_000L)
    val money2 = Money(1_000L)

    if (money1 > money2) {
        println("money1 이 money2보다 큽니다.")
    }

    isEqual()
}

fun isEqual() {
    val money1 = Money(1_000L)
    val money2 = money1
    val money3 = Money(1_000L)

    println(money1 === money2)
    println(money1 === money3)
    println(money1 == money3)
    println(money1 + money3)
}