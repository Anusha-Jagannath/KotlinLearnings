package june25

fun main(args: Array<String>) {
    println("Learning closures")
    var result = 0;
    var program = Program()
    program.addTwoNumbers(2, 3, { x, y -> result = x + y })
    println("The result is " + result)

}

class Program {

    fun addTwoNumbers(a: Int, b: Int, action: (Int, Int) -> Unit) {
        var result = action(a, b)
        println(result)
    }
}