package june26

fun main(args: Array<String>) {
    println("Learning conditional statement")

    val a = 2;
    val b = 3;
    var max =0;

    if (a>b)
        max = a;
    else max = b;


    val max1 = if (a >b) {
        println("greater is $a")
        a
    } else {
        println("greater is $b")
        b
    }


}