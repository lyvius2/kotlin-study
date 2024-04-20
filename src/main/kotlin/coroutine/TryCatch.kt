package coroutine

import kotlinx.coroutines.*

fun main(): Unit = runBlocking {
    // Try ~ Catch를 이용한 예외처리
    /*
    val job = launch {
        try {
            throw IllegalArgumentException()
        } catch (e: IllegalArgumentException) {
            printWithThread("정상 종료됨")
        }
    }
    */

    // ExceptionHandler 를 이용한 예외처리
    val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
        printWithThread("예외처리")
        throw throwable
    }

    val job = CoroutineScope(Dispatchers.Default).launch(exceptionHandler) {
        throw IllegalArgumentException()
    }

    delay(1_000L)
}