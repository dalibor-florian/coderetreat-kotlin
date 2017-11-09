import org.testng.Assert
import org.testng.annotations.Test

class ProgramTest {

    val instance: Program = Program()

    @Test
    fun test1(): Unit {
        val result = instance.add(1, 1)
        Assert.assertEquals(2, result)
    }

}