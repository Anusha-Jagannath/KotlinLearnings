package june19

fun main(args: Array<String>) {
    println("Learning sealed classes")
    val rect = Shape.Rectangle(10, 20)
    checkArea(rect)
}


sealed class Shape {
    class Circle(var radius: Float) : Shape()
    class Square(var side: Int) : Shape()
    class Rectangle(var length: Int, var breadth: Int) : Shape()

}

private fun checkArea(shape: Shape) {
    when (shape) {
        is Shape.Circle -> print("Area of circle is ${3.14 * shape.radius * shape.radius}")
        is Shape.Rectangle -> println("Area of rectangle is ${shape.length * shape.breadth}")
        is Shape.Square -> println("The Area of sqaure is ${shape.side*shape.side}")
    }
}

