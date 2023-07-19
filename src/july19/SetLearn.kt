package july19

fun main(args: Array<String>) {
    println("Learning set in kotlin")
    var mySet = setOf<Int>(2, 3, 4, 1, 2, 3)

    for (key in mySet) {
        println(key)
    }
}