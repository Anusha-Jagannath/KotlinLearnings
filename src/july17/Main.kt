package july17

fun main(args: Array<String>) {
    println("Learning default functions")
    println(findVolume(2, 3, 4))
    println(findVolume(2, 3))

}

@JvmOverloads
fun findVolume(a: Int, b: Int, c: Int = 3): Int {
    return a * b * c
}