package advanced.lec11

import kotlin.properties.PropertyDelegateProvider
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

fun main() {
    Person5()
}

class Person5 {
    val name by DelegateProvider("아무개")     // 정상동작
    val country by DelegateProvider("대한민국") // 정상동작 NO
}

class DelegateProvider(
    private val initValue: String
) : PropertyDelegateProvider<Any, DelegateProperty> {
    override fun provideDelegate(thisRef: Any, property: KProperty<*>): DelegateProperty {
        if (property.name != "name") {
            throw IllegalArgumentException("${property.name}은 안되요! name만 연결 가능합니다!")
        }
        return DelegateProperty(initValue)
    }
/*
    operator fun provideDelegate(thisRef: Any?, property: KProperty<*>): DelegateProperty {
        if (property.name != "name") {
            throw IllegalArgumentException("${property.name}은 안되요! name만 연결 가능합니다!")
        }
        return DelegateProperty(initValue)
    }*/
}

class DelegateProperty (
    private val initValue: String
) : ReadOnlyProperty<Any, String> {
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        return initValue
    }
}