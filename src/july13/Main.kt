package july13

fun main(args: Array<String>) {
    val map = HashMap<String, String>()
    map.put("1", "one");
    map.put("2", "two")
    map.put("3", "three")

    map.forEach {
        println("${it.key} ${it.value}")
    }
}