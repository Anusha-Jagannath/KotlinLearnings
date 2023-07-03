package july3

fun main(args: Array<String>) {
    println("Learning arrays in java")
    var myArray = Array<Int>(5) { 0 }
    println(myArray[0])

    myArray[1] = 5
    println(myArray[1])

    for (ele in myArray) {
        println(ele)
    }
}