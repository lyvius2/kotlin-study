package advanced.lec08

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class PersonTest1 {
    private val person = Person()
    @Test
    fun isKimTest() {
        // given
        val person = person.apply { name = "김갑수" }

        // when & then
        assertTrue(person.isKim)
    }

    @Test
    fun maskingNameTest() {
        // given
        val person = person.apply { name = "아무개" }

        // when & then
        assertEquals(person.maskingName, "아**")
    }
}