package june23

fun main(args: Array<String>) {

    var program = Program()
    program.addTwoNumbers(2, 3) { x, y -> x + y }
}

class Program {

    fun addTwoNumbers(a: Int, b: Int, action: (Int, Int) -> Int) {
        var result = action(2, 3)
        println(result)
    }
}