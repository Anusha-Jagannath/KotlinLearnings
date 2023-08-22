package aug22

fun main(args: Array<String>) {
    val myNumbers = listOf<Int>(1, 2, 3, 4, 5);
    val check = myNumbers.all { it > 10 }
    println(check)

    val check2 = myNumbers.any { it > 10 }
    println(check2)

    val count = myNumbers.count { it > 2 }
    println(count)

    val num = myNumbers.find { it > 10 }
    println(num)

}