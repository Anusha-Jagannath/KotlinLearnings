package june18

fun main(args: Array<String>) {
    println("learning sealed classes")
    var circle = Shape.Circle(3f)
    var square = Shape.Square(8);
    var rectangle = Shape.Rectangle(20,10);

}

fun checkShape(shape: Shape) {
    when(shape) {
        is Shape.Circle -> println("The area of circle is ${3.14*shape.radius*shape.radius}")
        is Shape.Rectangle -> println("The area of rectangle is ${shape.length*shape.breadth}")
        is Shape.Square -> println("The are of square is ${shape.side*shape.side}")
    }
}


enum class Color(val colorShade: String){
    BLUE("light blue"),
    GREEN("light green"),
    ORANGE("light orange")
}

sealed class  Shape {
    class Circle(var radius: Float): Shape()
    class Square(var side: Int): Shape()
    class Rectangle(var length: Int, var breadth: Int): Shape()
}