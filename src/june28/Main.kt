package june28

fun main(args: Array<String>) {
    println("learning kotlin basics")
    val x = 2;
    var str: String = when (x) {
        in 0..20 -> {
            println("x lies between 1 to 10")
            "hello"
        }

        2 -> {
            println("x is two")
            "klo"
        }

        else -> {
            println("x is unknown")
            println("I don't know the value of x")
            "iop"
        }
    }

    println("The value of string is $str")
}