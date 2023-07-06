package july6

fun main(args: Array<String>) {
    var myArray = Array<Int>(5) { 0 }
    myArray[0] = 1
    myArray[1] = 1

    myArray.forEach {
        println(it)
    }
}