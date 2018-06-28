import main.kotlin.whenNegative
import main.kotlin.whenPositive
import main.kotlin.whenZero
import org.junit.Assert.assertEquals
import org.junit.Test

class IntExtensionsSpec {
    @Test
    fun shouldExecuteBlockIfIntIsPositive() {
        var testInt = 5
        testInt.whenPositive { testInt = 10 }
        assertEquals(10, testInt)
    }

    @Test
    fun shouldNotExecuteBlockIfIntIsNegative() {
        var testInt = -5
        testInt.whenPositive { testInt = 10 }
        assertEquals(-5, testInt)
    }

    @Test
    fun shouldExecuteBlockIfIntIsNegative() {
        var testInt = -5
        testInt.whenNegative { testInt = 10 }
        assertEquals(10, testInt)
    }

    @Test
    fun shouldNotExecuteBlockIfIntIsNotNegative() {
        var testInt = 5
        testInt.whenNegative { testInt = 10 }
        assertEquals(5, testInt)
    }

    @Test
    fun shouldExecuteBlockIfIntIsZero() {
        var testInt = 0
        testInt.whenZero { testInt = 10 }
        assertEquals(10, testInt)
    }

    @Test
    fun shouldNotExecuteBlockIfIntIsNotZero() {
        var testInt = 5
        testInt.whenZero { testInt = 10 }
        assertEquals(5, testInt)
    }
}