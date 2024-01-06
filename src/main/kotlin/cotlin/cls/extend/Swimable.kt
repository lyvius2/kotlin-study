package cotlin.cls.extend

interface Swimable {

    val swimAbility: Int
        get() = 7

    fun act() {
        println("어푸어푸")
    }
    fun swim()
}