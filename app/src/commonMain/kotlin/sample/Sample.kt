package sample

expect class Sample() {
    fun checkMe(): Int
}

expect object Platform {
    val name: String
}

fun hello(): String = "Hello from ${Platform.name}"

fun dateFormat(): String = "dd-MM-YYYY HH:mm"

expect class CurrentDate(){
    fun getCurrentDate(): String
}

class Proxy {
    fun proxyHello() = hello()
}

fun main() {
    println(hello())
}
