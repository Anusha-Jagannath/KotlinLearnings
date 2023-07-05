package july4

fun main(args: Array<String>) {
    println("Learning do while in kotlin")

    var i: Int = 1

    do {
        if (i % 2 == 0) {
            println(i);
        }
        i++;
    } while (i <= 10)
}