package jun20

import java.util.logging.SocketHandler

fun main(args: Array<String>) {
    println("earning sealed classes")
    var circle = Shape.Circle(3.0f)
    var rectangle = Shape.Rectangle(10, 20)
    var square = Shape.Square(10)


}

fun checkShape(shape: Shape) {
    when (shape) {
        is Shape.Circle -> print("The area of circle is " + shape.radius)
        is Shape.Rectangle -> println("The area of rectangle is ${shape.breadth * shape.breadth}")
        is Shape.Square -> println("The area of square is ${shape.side * shape.side}")
        Shape.NotAShape -> println("The shape is not")
    }
}


enum class Color(val color: String) {
    ORANGE("light orange"),
    GREY("light grey"),
    WHITE("light white")
}

sealed class Shape {
    class Circle(var radius: Float) : Shape()
    class Rectangle(var length: Int, var breadth: Int) : Shape()
    class Square(var side: Int) : Shape()
    object NotAShape : Shape()
}