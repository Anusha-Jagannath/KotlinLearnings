package july16

fun main(args: Array<String>) {
    println("Learning interoperability")
    var result = findVolume(length = 2, breadth = 3, height = 5)
    var result1 = findVolume(length = 1, breadth = 4)
    println(result)
    println(result1)

}

@JvmOverloads
fun findVolume(length: Int, breadth: Int, height: Int = 6): Int {
    return length * breadth * height
}