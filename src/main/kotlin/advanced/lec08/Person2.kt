package advanced.lec08

class Person2 {
    private var _name: String? = null

    val name: String
        get() {
            if (_name == null) {
                Thread.sleep(2_000)
                this._name = "아무개"
            }
            return this._name!!
        }
}