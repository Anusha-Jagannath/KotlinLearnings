package july31

import july27.findGreater

fun main(args: Array<String>) {
    println("infix function")
    val a = 2;
    val b = 3;
    a.findGreaterNumber(b)
    a findGreater b
}

fun Int.findGreaterNumber(b: Int): Int {

    if (this > b) return this else return b
}