package july16

fun main(args: Array<String>) {
    println("Learning map data structure")
    var map = hashMapOf<Int, String>()
    map.put(1, "one")
    map.put(2, "two")
    map.put(3, "three")
    println(map)

    for (key in map.keys) {
        println(key)
    }

}