package july10

fun main(args: Array<String>) {
    println("Learning map data structure")
    var map = mapOf<Int, String>(1 to "io", 2 to "man", 3 to "kl")
    println(map)

    map.forEach {
        println("${it.key} ${it.value}")

    }
}