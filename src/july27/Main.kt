package july27

fun main(args: Array<String>) {
    println("Learning infix functions")

}

infix fun Int.findGreater(y: Int): Int {

    if (this > y) return this else return y;
}