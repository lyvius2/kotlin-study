import jakarta.cls.JavaMoney

fun main() {
    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    if (money1 > money2) {
        println("money1 이 money2보다 큽니다.")
    }

    isEqual()
}

fun isEqual() {
    val money1 = JavaMoney(1_000L)
    val money2 = money1
    val money3 = JavaMoney(1_000L)

    println(money1 === money2)
    println(money1 === money3)
    println(money1 == money3)
    println(money1 + money3)
}