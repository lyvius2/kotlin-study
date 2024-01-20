package coroutine

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main(): Unit = runBlocking {
    val time = measureTimeMillis {
        val job1 = async {
            apiCall1()
        }

        val job2 = async {
            apiCall2(job1.await())
        }
        //printWithThread(job1.await() + job2.await())
        printWithThread(job2.await())
    }

    printWithThread("소요 시간 : $time ms")
}

suspend fun apiCall1(): Int {
    delay(1_000L)
    return 1
}

suspend fun apiCall2(numeric: Int): Int {
    delay(1_000L)
    return numeric + 2
}

fun asyncSample(): Unit = runBlocking {
    val job = async {
        3 + 5
    }
    val eight = job.await()
    printWithThread(eight)
}