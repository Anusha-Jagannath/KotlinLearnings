package july9

fun main(args: Array<String>) {

    println("Learning list")
    val list = mutableListOf<String>("anu", "ami", "jkl")
    for (data in list) {
        println(data)
    }
    list.add("kl")

    for (data in list) {
        println(data)
    }
}