package jun22

fun main(args: Array<String>) {
    println("Learning higher order functions")
    var program = Program()
    program.addTwoNumbers(2, 3)

    program.addTwoNumber(2, 4, object : MyInterface {
        override fun execute(sum: Int) {
            println(sum)
        }
    })

    program.addTwoNumberss(2, 5) { s: Int -> println(s) }

}

class Program {


    fun addTwoNumberss(a: Int, b: Int, param: (Int) -> Unit) {
        param(a+b)
    }

    fun addTwoNumbers(a: Int, b: Int) {
        println(a + b)
    }

    fun addTwoNumber(a: Int, b: Int, action: MyInterface) {
        action.execute(a + b)
    }
}

interface MyInterface {

    fun execute(sum: Int)
}