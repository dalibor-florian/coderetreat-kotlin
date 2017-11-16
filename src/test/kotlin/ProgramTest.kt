import org.junit.Assert
import org.junit.Test

class ProgramTest {

    val instance: Program = Program()

    @Test
    fun test1(): Unit {
        val result = instance.add(1, 1)
        Assert.assertEquals(2, result)
    }
}