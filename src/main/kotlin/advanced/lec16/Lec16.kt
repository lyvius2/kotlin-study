package advanced.lec16

fun main() {
    // SAM 생성자
    val filter = StringFilter { s -> s.startsWith("A") }
    consumeFilter(filter)
}

fun consumeFilter(filter: StringFilter) {

}