package aug16

fun main(args: Array<String>) {
    println("Learning predicate in kotlin")
    val myNumbers = listOf<Int>(1,2,3,4,5,6)
    println(myNumbers.find { it -> it > 2 })
}