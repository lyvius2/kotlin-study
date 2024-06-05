package advanced.lec20_annotation

import kotlin.reflect.KClass

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FIELD, AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS)
@Repeatable
annotation class Shape(
    val text: String,
    //val number: Int,
    //val clazz: KClass<*>
)

class GoldFish(val name: String) {
    fun swim() {
    }
}

fun main() {
    val clazz: KClass<GoldFish> = GoldFish::class
}

@Shape(text = "repeatable")
@Shape(text = "annotation text")
class Annotation {

}