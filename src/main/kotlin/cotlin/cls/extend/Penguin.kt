package cotlin.cls.extend

class Penguin(species: String) : Animal(species, 2), Swimable, Flayable {
    private val wingCount: Int = 2
    override fun move() {
        println("펭귄이 뒤뚱뒤뚱 걸어간다.")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Swimable>.act()
        super<Flayable>.act()
    }

    override fun swim() {
        TODO("Not yet implemented")
    }

    override fun fly() {
        TODO("Not yet implemented")
    }

    override val swimAbility: Int
        get() = 3
}