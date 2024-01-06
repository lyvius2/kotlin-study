import jakarta.cls.Person

fun main() {
    val person: Person = Person("아무개")
    var person2: Person?

    val str: String? = "ABCD"
    println(str?.length ?:0)
}

fun startsWithA(str: String): Boolean {
    return str.startsWith("A")
}

fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException("this is null!")
    /*
    if (str == null) {
        throw IllegalArgumentException("this is null!")
    }
    return str.startsWith("A")
     */
}

fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
    /*
    if (str == null) {
        return null
    }
    return str.startsWith("A")*/
}

fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
    /*
    if (str == null) {
        return false
    }
    return str.startsWith("A")*/
}