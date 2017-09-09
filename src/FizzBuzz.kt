package play_kotlin

class FizzBuzz {
    fun judge(n: Int) {
        when {
            n % 15 == 0 -> println("FizzBuzz")
            n % 5 == 0 -> println("Buzz")
            n % 3 == 0 -> println("Fizz")
            else -> println(n)
        }
    }
}

fun main(args: Array<String>) {
    val fb = FizzBuzz()

    for (i in 1..30) {
        fb.judge(i)
    }
}