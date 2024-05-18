package advanced.lec09

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

// by lazy()
class Person3 {
    val name: String by LazyInitProperty {
        Thread.sleep(2_000)
        "아무개"
    }

    val status: String by object : ReadOnlyProperty<Person3, String> {
        private var isGreen: Boolean = false
        override fun getValue(thisRef: Person3, property: KProperty<*>): String {
            return if (isGreen) {
                isGreen = false
                "Happy"
            } else {
                isGreen = true
                "Sad"
            }
        }
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
    println(person.status)
    println(person.status)
}