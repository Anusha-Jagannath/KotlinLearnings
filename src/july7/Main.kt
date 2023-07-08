package july7

fun main(args: Array<String>) {
    println("Learning break")

    for (i in 1..3) {
        if (i == 2)
            break;
        println(i)
    }

    var myArray = Array<Int>(5) { 0 }
    myArray[0] = 2
    myArray[1] = 3
    myArray.forEach {
        println(it)
    }
}