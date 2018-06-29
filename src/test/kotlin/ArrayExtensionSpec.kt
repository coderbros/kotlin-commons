import main.kotlin.isEvery
import main.kotlin.isSome
import main.kotlin.print1DArray
import main.kotlin.print2DArray
import org.junit.Before
import org.junit.Test
import java.io.PrintStream
import java.io.ByteArrayOutputStream
import org.junit.After
import org.junit.Assert.assertEquals


class ArrayExtensionSpec {

    private val outContent = ByteArrayOutputStream()
    private val originalOut = System.out

    @Before
    fun setUp() {
        System.setOut(PrintStream(outContent))
    }

    @Test
    fun shouldPrint2dArray() {
        val twoDArray = arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6,7))
        print2DArray(twoDArray)

        val twoDArrayString = outContent.toString()

        outContent.reset()

        val oneDArray = arrayOf(1, 2, 3)
        print1DArray(oneDArray)

        val oneDArrayString = outContent.toString()

        assertEquals("1 2 3\n4 5 6 7", twoDArrayString)
        assertEquals("1 2 3", oneDArrayString)
    }

    @Test
    fun shouldReturnTrueIfEveryElementPassesThePredicate() {
        val array = arrayOf(4,6,8)

        val result = array.isEvery {
            it % 2 == 0
        }
        assertEquals(true, result)
    }

    @Test
    fun shouldReturnFalseIfEveryElementDoesNotPassesThePredicate() {
        val array = arrayOf(5,6,8)

        val result = array.isEvery {
            it % 2 == 0
        }
        assertEquals(false, result)
    }

    @Test
    fun shouldReturnTrueIfSomeElementPassesThePredicate() {
        val array = arrayOf(1,6,7)

        val result = array.isSome {
            it % 2 == 0
        }
        assertEquals(true, result)
    }

    @Test
    fun shouldReturnFalseIfNoElementPassesThePredicate() {
        val array = arrayOf(5,7,9)

        val result = array.isSome {
            it % 2 == 0
        }
        assertEquals(false, result)
    }

    @After
    fun restoreStreams() {
        System.setOut(originalOut)
    }
}