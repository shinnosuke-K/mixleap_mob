import org.junit.Assert
import org.junit.Test

class FizzBuzzPlusTest {

    @Test
    fun `3の倍数`() {
        Assert.assertEquals("Fizz", getFizzBuzz(3))
    }

    @Test
    fun `5の倍数`() {
        Assert.assertEquals("Buzz", getFizzBuzz(5))
    }

    @Test
    fun `3と5の倍数`() {
        Assert.assertEquals("FizzBuzz", getFizzBuzz(15))
    }

    @Test
    fun `3を含む`() {
        Assert.assertEquals("Fizz", getFizzBuzz(13))
    }

    @Test
    fun `5を含む`() {
        Assert.assertEquals("Buzz", getFizzBuzz(52))
    }

    @Test
    fun `3の倍数で5を含む`() {
        Assert.assertEquals("FizzBuzz", getFizzBuzz(14952))
    }

    @Test
    fun `５の倍数で3を含む`() {
        Assert.assertEquals("FizzBuzz", getFizzBuzz(35))
    }
}