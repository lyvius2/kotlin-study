package advanced.lec08

class Person3 {
    val name: String by lazy {
        Thread.sleep(2_000)
        "아무개"
    }
}