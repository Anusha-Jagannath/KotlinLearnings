package july11

fun main(args: Array<String>) {
    println("Learning kotlin functions")
    println(max(2, 3))
}

fun max(a: Int, b: Int): Int {

    return if (a > b) a else b

}