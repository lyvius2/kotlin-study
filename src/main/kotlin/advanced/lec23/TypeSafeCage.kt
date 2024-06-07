package advanced.lec23

import advanced.lec01.Animal
import advanced.lec01.Cage
import advanced.lec01.Carp
import kotlin.reflect.KClass
import kotlin.reflect.cast

fun main() {
    val cage = Cage()
    cage.put(Carp("잉어"))
    cage.getFirst() as Carp // Danger!

    val typeSafeCage = TypeSafeCage()
    typeSafeCage.putOne(Carp::class, Carp("잉어"))
    typeSafeCage.putOne(Carp("고등어"))
    val one: Carp = typeSafeCage.getOne(Carp::class)
    val one2 = typeSafeCage.getOne<Carp>()
}

class TypeSafeCage {
    private val animals: MutableMap<KClass<*>, Animal> = mutableMapOf()

    fun <T : Animal> getOne(type: KClass<T>): T {
        return type.cast(animals[type])
    }

    fun <T : Animal> putOne(type: KClass<T>, animal: T) {
        animals[type] = type.cast(animal)
    }

    inline fun <reified T : Animal> getOne(): T {
        return this.getOne(T::class)
    }

    inline fun <reified T : Animal> putOne(animal: T) {
        this.putOne(T::class, animal)
    }
}

