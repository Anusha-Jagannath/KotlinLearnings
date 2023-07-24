package july24

fun main(args: Array<String>) {
    println("Learning named parameters")
    var result = findVolume(2, 3, 4)
    System.out.println(result)
}

@JvmOverloads
fun findVolume(length: Int, breadth: Int, height: Int=2): Int {
    return length * breadth * height;
}