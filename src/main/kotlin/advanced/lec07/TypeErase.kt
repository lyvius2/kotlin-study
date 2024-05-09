package advanced.lec07

import advanced.lec01.Animal
import advanced.lec01.GoldFish

open class CageV1<T : Animal> {
    open fun addAnimal(animal: T) {

    }
}

class CageV2<T : Animal> : CageV1<T>() {
    override fun addAnimal(animal: T) {
        super.addAnimal(animal)
    }
}

class GoldFishCageV2 : CageV1<GoldFish>() {
    override fun addAnimal(animal: GoldFish) {
        super.addAnimal(animal)
    }
}