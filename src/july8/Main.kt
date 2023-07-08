package july8


fun main(args: Array<String>) {
    println("Learning kotlin basics")


    for (i in 1..10) {
        if (i % 2 == 0)
            continue
        println(i)
    }
}