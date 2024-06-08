package advanced.lec25

fun logic(n: Int) {
    when {
        n > 0 -> throw AException()
        n == 0 -> throw BException()
    }
    throw CException()
}

class AException : RuntimeException()
class BException : RuntimeException()
class CException : RuntimeException()

fun main() {
    try {

    } catch (e: Exception) {
        when (e) {
            is AException,
            is BException -> TODO()
            is CException -> TODO()
        }
        throw e
    }
}

