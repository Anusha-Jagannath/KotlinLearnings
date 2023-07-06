package july6

fun main(args: Array<String>) {
    println("Learning kotlin basics")

    for (i in 1..5) {
        for (j in 1..5) {
            if (i == 1 && j == 2) {
                break
            }
            println("$i $j")
        }
    }
}