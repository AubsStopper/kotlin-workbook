import me.aubsled.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class StringExtensionsTest() {
    @Test
    fun `ftCountVowels should return zero`() {
        val subject = "bbbb"
        val result = subject.ftCountVowels()
        assertEquals(0, result)
    }

    @Test
    fun `ftCountVowels should return count of vowels`() {
        val subject = "testeroni"
        val result = subject.ftCountVowels()
        assertEquals(4, result)
    }

    @Test
    fun `ftCountVowels is case insensitive`(){
        val subject = "FREAKYFRIDAY"
        val result = subject.ftCountVowels()
        assertEquals(4,result)
    }

    @Test
    fun `ftIsPalindrome should return false`() {
        val subject = "notapalindrome"
        val result = subject.ftIsPalindrome()
        assertFalse ( "$subject is not a palindrome") { result }
    }

    @Test
    fun `ftIsPalindrome should return true`() {
        val subject = "racecar"
        val result = subject.ftIsPalindrome()
        assertTrue("$subject expected to be a palindrome") { result }
    }

    @Test
    fun `ftIsPalindrome ignores casing`() {
        val subject = "HaNnAh"
        val result = subject.ftIsPalindrome()
        assertTrue { result }
    }

    @Test
    fun `ftIsPalindrome ignores special characters`() {
        val subject = "A man, a plan, a canal: Panama"
        val result = subject.ftIsPalindrome()
        assertTrue { result }
    }

    @Test
    fun `toTitleCase one word `() {
        val subject = "james"
        val result = subject.ftToTitleCase()
        assertEquals("James", result)
    }

    @Test
    fun `toTitleCase one letter`() {
        val subject = "p"
        val result = subject.ftToTitleCase()
        assertEquals("P", result)
    }

    @Test
    fun `toTitleCase multiple words`() {
        val subject = "bam jam tan man"
        val result = subject.ftToTitleCase()
        assertEquals("Bam Jam Tan Man", result)
    }

    @Test
    fun `toTitleCase multiple word multiple spaces`() {
        val subject = "  the    space   between    "
        val result = subject.ftToTitleCase()
        assertEquals("The Space Between", result)
    }

}