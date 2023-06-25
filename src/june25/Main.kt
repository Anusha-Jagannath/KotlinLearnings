package june25

fun main(args: Array<String>) {
    println("learning ranges in kotlin")

    var r1 = 1..5 step 2
    var r2 = 5 downTo 1
    var r3 = 5 downTo 1 step 2

    var r4 = 'a'..'z'
    var isPresent = 'c' in r4

    var countDown = 10.downTo(1)
    
}