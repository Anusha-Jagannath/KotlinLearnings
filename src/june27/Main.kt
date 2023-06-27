package june27

fun main(args: Array<String>) {
    println("Learning condition statements")
    val a = 3;
    val b = 2
    var max = 0
    if (a > b) max = a else max = b
    println(max)


    val result = if (a > b) a else b
}