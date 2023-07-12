package july12

fun main(args: Array<String>) {
    println("Learning kotlin basics")
    val map =
        hashMapOf<Int, String>(2 to "yog", 3 to "man", 4 to "iop")

    for (key in map.keys) {
        println(key)
    }

    map.replace(3, "modulo")

    map.forEach {
        println(it.key)
    }
}