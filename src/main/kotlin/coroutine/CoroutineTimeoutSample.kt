package coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout
import kotlinx.coroutines.withTimeoutOrNull

fun main() = runBlocking {
    val result1: Int? = withTimeoutOrNull(1_000L) {
        delay(1_500L)
        2 + 9
    }
    printWithThread(result1)

    val result2 = withTimeout(1_000L) {
        delay(1_500L)
        10 + 20
    }
    printWithThread(result2)
}