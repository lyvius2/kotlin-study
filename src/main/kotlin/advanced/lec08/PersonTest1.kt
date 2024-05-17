package advanced.lec08

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class PersonTest1 {
    private val person = Person()
    @Test
    fun isKimTest() {
        assertTrue(person.apply { name = "김갑수" }.isKim)
    }

    @Test
    fun maskingNameTest() {
        assertEquals(person.apply { name = "아무개" }.maskingName, "아**")
    }
}