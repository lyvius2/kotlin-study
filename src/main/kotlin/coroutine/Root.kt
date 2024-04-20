package coroutine

import kotlinx.coroutines.*

fun main(): Unit = runBlocking {
    // 자식 코루틴의 에러가 부모에게 전파된다.
    /*
    val job = async {
        throw IllegalArgumentException()
    }*/

    // 자식 코루틴의 에러를 부모에게 전파하지 않는다.
    val job = async(SupervisorJob()) {
        throw IllegalArgumentException()
    }

    delay(1_000L)
    //job.await() // async 함수의 결과를 리턴함으로써 에러를 부모에게 전파한다
}

fun asyncSample(): Unit = runBlocking {
    val job = CoroutineScope(Dispatchers.Default).async {
        throw IllegalArgumentException()
    }

    delay(1_000L)
    job.await()
}

fun launchSample(): Unit = runBlocking {
    val job = CoroutineScope(Dispatchers.Default).launch {
        throw IllegalArgumentException()
    }

    delay(1_000L)
}

fun rootSample(): Unit = runBlocking {
    val job1 = CoroutineScope(Dispatchers.Default).launch {
        delay(1_000L)
        printWithThread("Job 1")
    }

    val job2 = CoroutineScope(Dispatchers.Default).launch {
        delay(1_000L)
        printWithThread("Job 2")
    }
}