package cotlin.cls.extend

abstract class Animal(
    protected val species: String,
    protected open val legCount: Int
) {

    abstract fun move()

}