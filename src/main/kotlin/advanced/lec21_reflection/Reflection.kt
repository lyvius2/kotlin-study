package advanced.lec21_reflection

import advanced.lec15.add
import kotlin.reflect.KClass
import kotlin.reflect.KFunction
import kotlin.reflect.KType
import kotlin.reflect.cast
import kotlin.reflect.full.createType
import kotlin.reflect.full.hasAnnotation

// JVM
fun main() {    // KClass<T> Class<T>
    val callable = ::add
    executeAll(Reflection())
    val kClass: KClass<Reflection> = Reflection::class

    val ref = Reflection()
    val kClass2: KClass<out Reflection> = ref::class

    val kClass3: KClass<out Any> = Class.forName("advanced.lec21_reflection.Reflection").kotlin
    kClass.java // Class<Reflection>
    kClass.java.kotlin  // KClass<Reflection>

    // inner class
    // inline function
    // KType : 타입을 표현
    val kType: KType = GoldFish::class.createType()

    val goldFish = GoldFish("금붕이")
    goldFish::class.members.first { it.name == "print" }.call(goldFish)
}

class GoldFish(val name: String) {
    fun print() {
        println("금붕어 이름은 ${name}입니다.")
    }
}

fun castToGoldFish(obj: Any): GoldFish {
    return GoldFish::class.cast(obj)
}

@Target(AnnotationTarget.CLASS)
annotation class Executable

@Executable
class Reflection {
    fun a() {
        println("A입니다.")
    }

    fun b(n: Int) {
        println("B입니다.")
    }
}

fun executeAll(obj: Any) {
    val kClass = obj::class
    if (!kClass.hasAnnotation<Executable>()) {
        return
    }

    val callableFunctions = kClass.members.filterIsInstance<KFunction<*>>()
        .filter { it.returnType == Unit::class.createType() }
        .filter { it.parameters.size == 1 &&  it.parameters[0].type == kClass.createType() }

    callableFunctions.forEach { function ->
        //function.call(kClass.createInstance())
        function.call(obj)
    }
}