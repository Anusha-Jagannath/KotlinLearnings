package july19

fun main(args: Array<String>) {
    val result = findVolume(length = 2, breadth = 1, height = 3)
    println(result)
}

fun findVolume(length: Int, breadth: Int, height: Int): Int {
    return length + breadth + height
}