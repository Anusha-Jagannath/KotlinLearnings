package june30

fun main(args: Array<String>) {
    println("Learning collection sin kotlin")
    val myrray = Array<Int>(5) { 0 }
    println(myrray[0])
    myrray[1] = 6

    println(myrray[1])

    for (ele in myrray) {
        println(ele)
    }
}