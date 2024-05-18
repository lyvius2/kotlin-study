package advanced.lec09

import kotlin.reflect.KProperty

// by lazy()
class Person3 {
    val name: String by LazyInitProperty {
        Thread.sleep(2_000)
        "아무개"
    }
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

    operator fun getValue(thisRef: Any, property: KProperty<*>): T {
        return value
    }

    operator fun setValue(thisRef: Any, property: KProperty<*>, value: T) {
        this._value = value
    }
}

fun main() {
    val person = Person3()
    println(person.name)
}