import me.aubsled.workbook.Student
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class StudentTest {
    @Test
    fun `test the average`() {
        val student = Student("student")
        student.addScore(50)
        student.addScore(50)
        student.addScore(50)

        val result = student.average()
        assertEquals(50.0, result)
    }

    @Test
    fun `test letterGrade is F`() {
        val student = Student("student")
        student.addScore(50)
        student.addScore(50)
        student.addScore(50)

        val result = student.letterGrade()
        assertEquals('F', result)
    }

}