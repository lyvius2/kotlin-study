package coroutine

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    //controlStart()
    //controlCancel()
    controlJoin()
}

fun controlJoin(): Unit = runBlocking {
    val job1 = launch {
        delay(1_000)
        printWithThread("Job 1")
    }
    job1.join()

    val job2 = launch {
        delay(1_000)
        printWithThread("Job 2")
    }
}

fun controlCancel(): Unit = runBlocking {
    val job = launch {
        (1..5).forEach {
            printWithThread(it)
            delay(500)
        }
    }

    delay(1_000L)
    job.cancel()
}

fun controlStart(): Unit = runBlocking {
    val job = launch(start = CoroutineStart.LAZY) {
        printWithThread("Hello Launch World")
    }
    delay(1_000L)
    job.start()
}