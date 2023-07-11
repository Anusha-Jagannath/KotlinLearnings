package july11

fun main(args: Array<String>) {
    println("Learning map")
    val map = mapOf<Int, String>(1 to "io", 2 to "to", 3 to "three")
    map.forEach { t, u ->
        println("$t $u")
    }

    for (key in map.keys) {
        println(key)
    }
}