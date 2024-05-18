package advanced.lec10

import kotlin.properties.Delegates.notNull
import kotlin.properties.Delegates.observable
import kotlin.properties.Delegates.vetoable

class Person {
    // primitive 에 lateinit 과 같은 기능을 요구할 때
    var age: Int by notNull()

    var age2: Int by observable(20) { _, oldValue, newValue ->
        if (oldValue != newValue) {
            println("이전 값 : ${oldValue} -> 새로운 값 : ${newValue}")
        }
    }

    // onChange가 true일 때만 변경된 값이 적용됨
    var age3: Int by vetoable(20) { _, _, newValue -> newValue >= 1 }

    @Deprecated("age4를 사용하세요!", ReplaceWith("age4"))
    var num: Int = 0

    var age4: Int by this::num
}

fun main() {
    val person = Person()
    person.age2 = 30

    person.age3 = -10
    println("${person.age3 == -10} ? ${person.age3}")
    person.age3 = 24
    println("${person.age3 == 24} ? ${person.age3}")

    println("person.age4: ${person.age4}")
}