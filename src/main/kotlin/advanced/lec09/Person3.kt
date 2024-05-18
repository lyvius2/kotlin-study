package advanced.lec09

// by lazy()
class Person3 {
    private val delegateProperty = LazyInitProperty {
        Thread.sleep(2_000)
        "아무개"
    }

    val name: String
        get() = delegateProperty.value
}

class LazyInitProperty<T>(val init: () -> T) {
    private var _value: T? = null
    val value: T
        get() {
           if (_value == null) {
               this._value = init()
           }
            return _value!!
        }
}

fun main() {
    var person = Person3()
    println(person.name)
}