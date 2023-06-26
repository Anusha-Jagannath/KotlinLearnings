package june26

fun main(args: Array<String>) {
    println("Learning lambda in kotlin")

    val program = Program()
    program.addTwoNumbers(2, 3, { x, y -> x + y })

    program.reverseString("heelo", { it.reversed() })
}

class Program {

    fun addTwoNumbers(a: Int, b: Int, action: (Int, Int) -> Int) {
        val result = action(a, b)
        println(result)
    }


    fun reverseString(s: String, action: (String) -> String) {
        var result = action(s)
        println(result)
    }

}