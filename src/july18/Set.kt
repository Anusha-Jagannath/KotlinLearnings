package july18

fun main(args: Array<String>) {
    println("Learning hashset")
    var mySet = setOf<Int>(1, 2, 3, 4, 1, 2)
    println(mySet)
    mySet.forEach {
        println(it)
    }

}