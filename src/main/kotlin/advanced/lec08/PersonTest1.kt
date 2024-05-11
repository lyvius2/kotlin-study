package advanced.lec08

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class PersonTest1 {
    @Test
    fun isKimTest() {
        // given
        val person = Person("김갑수")

        // when & then
        assertTrue(person.isKim)
    }

    @Test
    fun maskingNameTest() {
        // given
        val person = Person("아무개")

        // when & then
        assertEquals(person.maskingName, "아**")
    }
}