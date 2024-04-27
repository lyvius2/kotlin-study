package advanced.lec04

import advanced.lec01.Animal
import advanced.lec01.Fish

fun main() {
    val fishCage = Cage3<Fish>()
    val animalCage: Cage3<Animal> = fishCage
}