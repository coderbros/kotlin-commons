import main.kotlin.*
import org.junit.Assert.assertEquals
import org.junit.Test

class StringExtensionsSpec {

    @Test
    fun shouldExecuteBlockIfStringIsBlank() {
        var string1 = ""
        var string2 = " "

        string1.whenBlank { string1 = "string1Tested" }
        string2.whenBlank { string2 = "string2Tested" }

        assertEquals("string1Tested", string1)
        assertEquals("string2Tested", string2)
    }

    @Test
    fun shouldNotExecuteBlockIfStringIsNotBlank() {
        var string1 = "Not blank"
        var string2 = "not blank"

        string1.whenBlank { string1 = "string1Tested" }
        string2.whenBlank { string2 = "string2Tested" }

        assertEquals("Not blank", string1)
        assertEquals("not blank", string2)
    }

    @Test
    fun shouldNotExecuteBlockIfStringIsBlank() {
        var string1 = ""
        var string2 = " "

        string1.whenNotBlank { string1 = "string1Tested" }
        string2.whenNotBlank { string2 = "string2Tested" }

        assertEquals("", string1)
        assertEquals(" ", string2)
    }

    @Test
    fun shouldExecuteBlockIfStringIsNotBlank() {
        var string1 = "Not blank"
        var string2 = "not blank"

        string1.whenNotBlank { string1 = "string1Tested" }
        string2.whenNotBlank { string2 = "string2Tested" }

        assertEquals("string1Tested", string1)
        assertEquals("string2Tested", string2)
    }

    @Test
    fun shouldExecuteBlockIfStringHasSpaceAtBeginning() {
        var string1 = " Not blank"
        var string2 = " "

        string1.whenWhiteSpacesAtBeginning { string1 = "string1Tested" }
        string2.whenWhiteSpacesAtBeginning { string2 = "string2Tested" }

        assertEquals("string1Tested", string1)
        assertEquals(" ", string2)
    }

    @Test
    fun shouldExecuteBlockIfStringHasSpaceAtEnd() {
        var string1 = "Not blank "
        var string2 = " not blank "
        var string3 = "  "

        string1.whenWhiteSpacesAtEnd { string1 = "string1Tested" }
        string2.whenWhiteSpacesAtBeginning { string2 = "string2Tested" }
        string2.whenWhiteSpacesAtBeginning { string2 = "string3Tested" }

        assertEquals("string1Tested", string1)
        assertEquals("string2Tested", string2)
        assertEquals("  ", string3)
    }

    @Test
    fun shouldExecuteBlockIfStringIsEmpty() {
        var string1 = ""
        var string2 = " "
        var string3 = "not blank"

        string1.whenEmpty { string1 = "string1Tested" }
        string2.whenEmpty { string2 = "string2Tested" }
        string2.whenEmpty { string2 = "string3Tested" }

        assertEquals("string1Tested", string1)
        assertEquals(" ", string2)
        assertEquals("not blank", string3)
    }
}