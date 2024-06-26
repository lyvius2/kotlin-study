package example

import org.openjdk.jmh.annotations.Benchmark
import org.openjdk.jmh.annotations.BenchmarkMode
import org.openjdk.jmh.annotations.Mode
import org.openjdk.jmh.annotations.OutputTimeUnit
import org.openjdk.jmh.annotations.Scope
import org.openjdk.jmh.annotations.Setup
import org.openjdk.jmh.annotations.State
import java.util.concurrent.TimeUnit
import kotlin.random.Random
import kotlin.system.measureTimeMillis

@State(Scope.Benchmark)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
open class SequenceTest {
    private val fruits = mutableListOf<Fruit>()

    @Setup
    fun init() {
        (1..2_000_000).forEach { _ -> fruits.add(Fruit.random()) }
    }

    @Benchmark
    fun kotlinSequence() {
        val time = measureTimeMillis {
            val avg = fruits.asSequence()
                .filter{ it.name == "사과" }
                .map { it.price }
                .take(10_000)
                .average()
        }
        println("소요시간 : ${time} ms")
    }

    @Benchmark
    fun kotlinIterator() {
        val time = measureTimeMillis {
            val avg = fruits
                .filter { it.name == "사과" }
                .map { it.price }
                .take(10_000)
                .average()
        }
        println("소요시간 : ${time} ms")
    }
}

data class Fruit(
    val name: String,
    val price: Long,
) {
    companion object {
        private val NAME_CANDIDATES = listOf("사과", "바나나", "수박", "체리", "오렌지")
        fun random(): Fruit {
            val random1 = Random.nextInt(0, 5)
            val random2 = Random.nextLong(1000, 20001)
            return Fruit(
                name = NAME_CANDIDATES[random1],
                price = random2
            )
        }
    }
}