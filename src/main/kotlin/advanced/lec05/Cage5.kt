package advanced.lec05

import advanced.lec01.Animal
import advanced.lec01.Cage2
import advanced.lec01.GoldFish

fun main() {
    val cage = Cage5(mutableListOf(Eagle(), Sparrow(), Kestrel()))
    cage.printAfterSorting()
    Cage2<GoldFish>()
}

abstract class Bird(
    name: String,
    private val size: Int,
) : Animal(name), Comparable<Bird> {
    override fun compareTo(other: Bird): Int {
        return this.size.compareTo(other.size)
    }
}

class Sparrow : Bird("참새", 100)
class Eagle : Bird("독수리", 500)
class Kestrel : Bird("황조롱이", 320)

//class Cage5<T : Animal> {
class Cage5<T>(
    private val animals: MutableList<T> = mutableListOf()
) where T : Animal, T : Comparable<T> {
    fun printAfterSorting() {
        this.animals.sorted()
            .map { it.name }
            .let { println(it) }
    }

    fun getFirst(): T {
        return animals.first()
    }

    fun put(animal: T) {
        this.animals.add(animal)
    }

    fun moveFrom(otherCage: Cage5<T>) {
        this.animals.addAll(otherCage.animals)
    }

    fun moveTo(otherCage: Cage5<T>) {
        otherCage.animals.addAll(this.animals)
    }
}
/*
fun List<String>.hasIntersection(other: List<String>): Boolean {
    return (this.toSet() intersect other.toSet()).isNotEmpty()
}

fun <T> List<T>.hasIntersection(other: List<T>): Boolean {
    return (this.toSet() intersect other.toSet()).isNotEmpty()
}
 */