package play_kotlin

class Hello {
    fun world() {
        println(message = "Hello World")
    }
}

fun main(argv: Array<String>) {
    val hello = Hello()
    hello.world()
}
