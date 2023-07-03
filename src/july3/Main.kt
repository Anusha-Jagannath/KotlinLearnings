package july3

fun main(args: Array<String>) {
    println("Learning while loops in java")

    var i = 0;
    while (i < 100) {
        println(i)
        i++
    }


    var j =0;
    while (j < 100) {
        if (j % 2 ==0 ){
            println(j)
            j++;
        }
    }
}