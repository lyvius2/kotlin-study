package cotlin.cls.etc

fun main() {
    abc@ for (i in 1..100) {
        for (j in 1..100) {
            if (j == 2) {
                break@abc
            }
            println("${i}, ${j}")
        }
    }

    for (i in 1..100) {
        def@ for (j in 1..100) {
            if (j == 2) {
                break@def
            }
            println("${i}, ${j}")
        }
    }
}