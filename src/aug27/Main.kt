package aug27

fun main(args: Array<String>) {

    var name: String? = null
    println("The length of name is ${name?.length}")
    name?.let {
        println("The length of name is ${name.length}")
    }

    var length = if (name != null) name.length else -1;
    var length2 = name?.length ?: -1
    println("The length of name is $length2")
}