package play_kotlin

class FizzBuzz {
    fun judge(n: Int): String {
        return when {
            n % 15 == 0 -> "FizzBuzz"
            n % 5 == 0 -> "Buzz"
            n % 3 == 0 -> "Fizz"
            else -> n.toString()
        }
    }
}

fun main(args: Array<String>) {
    val fb = FizzBuzz()

    for (i in 1..30) {
        println(fb.judge(i))
    }
}