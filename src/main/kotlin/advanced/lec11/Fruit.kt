package advanced.lec11

interface Fruit {
    val name: String
    val color: String
    fun bite()
}

class Apple: Fruit {
    override val name: String
        get() = "사과"
    override val color: String
        get() = "빨간색"

    override fun bite() {
        println("아삭 아삭")
    }
}

class GreenApple(
    private val apple: Apple
) : Fruit by apple {
    override val color: String
        get() = "초록색"
}