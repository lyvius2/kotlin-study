package cotlin.cls

import jakarta.cls.JavaPerson

fun main() {
    val person: Person = Person("아무개", 22)
    println(person.name)
    person.age = 30
    println(person.age)

    var person2: JavaPerson = JavaPerson("월터", 24)
    println(person2.name)

    val person3: Person = Person("Baby")
    println(person3.age)

    val person4 = Person()
    println(person4.name)
}
class Person(name: String, var age: Int) {
    //val name: String = name
    //var age: Int = age

    var name = name
        get() = field.uppercase()
        set(value) {
            field = value.uppercase()
        }

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("초기화 블록")
    }

    constructor(name: String): this(name, 1) {
        println("첫번째 부생성자")
    }

    constructor(): this("홍길동") {
        println("두번째 부생성자")
    }

    fun isAdult(): Boolean {
        return this.age >= 20
    }

    val isAdult: Boolean
        get() = this.age >= 20
}