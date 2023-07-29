package july26

fun main(args: Array<String>) {
    println("Learning set and hashset")
    val mySet = setOf<Int>(1, 2, 3, 1, 2, 3, 4)
    println(mySet)

    for (element in mySet) {
        println(element)
    }
}