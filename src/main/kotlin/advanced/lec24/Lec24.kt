package advanced.lec24

import kotlin.system.measureTimeMillis

class Lec24 {
}

fun main() {
//    TODO("main 함수 구현")
    repeat(3) {
        println("Hello!")
    }

    val duration =  measureTimeMillis {
        val a = 1
        val b = 2
        val result = a + b
    }
    println("Duration: $duration")

    try {
        acceptOnlyTwo(3)
    } catch (e: Exception) {
        println(e)
    }

    try {
        Person().sleep()
    } catch (e: Exception) {
        println(e)
    }

    val result: Result<Int> = runCatching { 1 / 0 }
    println(result)
    if (result.isSuccess) {
        println(result.getOrThrow())
    } else {
        println(result.exceptionOrNull())
    }
}

fun acceptOnlyTwo(num: Int) {
    require(num == 2) { "2만 허용!" }
/*
    if (num != 2) {
        throw IllegalArgumentException("2만 허용!")
    }
 */
}

class Person {
    val status = PersonStatus.SLEEPING

    fun sleep() {
        check(this.status == PersonStatus.PLAYING) { "에러 메시지" }
        /*
        if (status != PersonStatus.PLAYING) {
            throw IllegalStateException()
        }
         */
    }
    enum class PersonStatus {
        PLAYING, SLEEPING
    }
}