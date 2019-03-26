import kotlin.test.assertEquals

fun Int.hasThree(): Boolean {
    if(this.toString().indexOf('3') != -1) return true
    return false
}

fun Int.hasFive(): Boolean {
    var num = this
    var modnum: Int?

    while (num > 0) {
        modnum = num % 10
        num /= 10
        if (modnum == 5 ) return true
    }
    return false
}

fun main(args: Array<String>) {
    for (n in 1..100) {
        println(getFizzBuzz(n))
    }
    // テスト
//    println("3の倍数")
//    assertEquals("Fizz", getFizzBuzz(3))
//    println("5の倍数")
//    assertEquals("Buzz", getFizzBuzz(5))
//    println("3と5の倍数")
//    assertEquals("FizzBuzz", getFizzBuzz(15))
//    println("3を含む")
//    assertEquals("Fizz", getFizzBuzz(13))
//    println("5を含む")
//    assertEquals("Buzz", getFizzBuzz(52))
//    println("3の倍数で5を含む")
//    assertEquals("FizzBuzz", getFizzBuzz(51))
//    println("５の倍数で3を含む")
//    assertEquals("FizzBuzz", getFizzBuzz(35))

}

fun getFizzBuzz(n: Int): String {
//    return if (n % 15 == 0) "FizzBuzz"
//    else if (n.hasFive() && n.hasThree()) "FizzBuzz"
//    else if (n % 3 == 0) "Fizz"
//    else if (n % 5 == 0) "Buzz"
//    else if (n.hasThree()) "Fizz"
//    else if (n.hasFive()) "Buzz"
//    else "$n"

    var result = ""

    if (n % 3 == 0 || n.hasThree()) {
        result += "Fizz"
    }

    if (n % 5 == 0 || n.hasFive()) {
        result += "Buzz"
    }

    if (result.isNullOrEmpty()) {
        result = "$n"
    }

    return result
}