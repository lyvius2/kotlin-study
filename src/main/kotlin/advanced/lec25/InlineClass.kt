package advanced.lec25

fun main() {
    val key = Key("비밀 번호")
    println(key)

    val inlineUserId = Id<User>(1L)
    val inlineBookId = Id<Book>(2L)
    handleV2(inlineUserId, inlineBookId)
}

@JvmInline
value class Key(val key: String)

class User(
    val id: Id<User>,
    val name : String,
)

class Book(
    val id: Id<Book>,
    val name: String,
)

fun handle(userId: Long, bookId: Long) {

}

fun handleV2(userId: Id<User>, bookId: Id<Book>) {

}

@JvmInline
value class Id<T>(val id: Long)

@JvmInline
value class Number(private val num: Long) {
    init {
        require(num in 1..10)
    }
}