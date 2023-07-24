package july24


fun main(args: Array<String>) {
    var mySet = setOf<Int>(2, 3, 1, 4, 5, 1);

    mySet.forEach {
        println(it)
    }
}