fun main() {
    judgeNumber(1)
    judgeNumber2(2)
}

fun validateScoreIsNotNegative(score: Int) {
    if (score < 0) {
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.")
    }
}

fun validate1(score: Int) {
    if (score !in 0..100) {
        throw IllegalArgumentException("${score}는 0과 100사이에 있어야 합니다.")
    }
}

fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else if (score >= 60) {
        "D"
    } else {
        "E"
    }
}

fun getGradeWithSwitch(score: Int): String {
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        6 -> "D"
        in 3..5 -> "E"
        else -> "F"
    }
}

fun judgeNumber(number: Int) {
    when (number) {
        1,0,-1 -> println("어디서 많이 본 숫자네요.")
        else -> println("1,0,-1이 아닙니다.")
    }
}

fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0입니다.")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다.")
        else -> println("주어진 숫자는 홀수입니다.")
    }
}