import main.kotlin.whenNotNull
import main.kotlin.whenNull
import org.junit.Assert.assertEquals
import org.junit.Test

class NullableExtensionsSpec {

    @Test
    fun shouldExecuteBlockIfNull() {
        var foo: String? = null
        foo.whenNull {  foo = "fooTested" }
        assertEquals("fooTested", foo)
    }

    @Test
    fun shouldNotExecuteBlockIfNonNull() {
        var foo: String? = "non null"
        foo.whenNull {  foo = "fooTested" }
        assertEquals("non null", foo)
    }

    @Test
    fun shouldExecuteBlockIfNonNull() {
        var foo: String? = "non null"
        foo.whenNotNull {  foo = "fooTested" }
        assertEquals("fooTested", foo)
    }

    @Test
    fun shouldNotExecuteBlockIfNull() {
        var foo: String? = null
        foo.whenNotNull {  foo = "fooTested" }
        assertEquals(null, foo)
    }
}