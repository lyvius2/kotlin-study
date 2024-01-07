package cotlin.cls.`object`

import jakarta.cls.Movable

fun main() {
    moveSomething(object : Movable {
        override fun move() {
            println("움직이다.")
        }

        override fun fly() {
            println("날다.")
        }
    })
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}