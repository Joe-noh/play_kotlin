package play_kotlin

class Hello(val words: Array<String>) {
    fun world() {
        if (words.isEmpty()) {
            println("Hello World")
        } else {
            words.forEach {
                println("Hello $it")
            }
        }
    }
}

fun main(argv: Array<String>) {
    val hello = Hello(argv)
    hello.world()
}
