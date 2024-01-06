import jakarta.cls.JavaPerson

fun main() {
    val javaPerson: JavaPerson = JavaPerson("아무개")
    var javaPerson2: JavaPerson?

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