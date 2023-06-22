package june22


fun main(args: Array<String>) {
    println("Learning high level functions")
    val program = Program()
    program.addTwoNumbers(2, 3)
    program.addTwoNumbers(2, 3, object : MyInterface {
        override fun print(sum: Int) {
            println(sum)
        }
    })

    program.addTwoNumberss(2, 3, { s: Int -> println(s) })
}

class Program {

    fun addTwoNumbers(a: Int, b: Int) {
        println(a + b);
    }

    fun addTwoNumbers(a: Int, b: Int, action: MyInterface) {
        action.print(a + b)
    }

    fun addTwoNumberss(a: Int, b: Int, action: (Int) -> Unit) {
        action(a + b)
    }


}

interface MyInterface {

    fun print(sum: Int)
}