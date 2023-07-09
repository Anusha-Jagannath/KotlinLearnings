package july9


fun main(args: Array<String>) {
    println("Learning kotlin basics")
    val rectangle = Rectangle()
    rectangle.findArea(2, 3)

}

class Rectangle {

    fun findArea(length: Int, breadth: Int): Int {
        return length * breadth;
    }
}