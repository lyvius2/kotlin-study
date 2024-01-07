package cotlin.cls.inner

fun main() {

}

class House(
    val address: String,
) {
    var livingRoom = this.LivingRoom(10.0)

    inner class LivingRoom(
        private val area: Double
    ) {
        val address: String
            get() = this@House.address
    }
}