package Aug1

fun main(args: Array<String>) {

    println(fibonccai(8000))
}

tailrec fun fibonccai(n: Int): Int {

    if (n== 0 || n== 1)  return n;

    return fibonccai(n-1) + fibonccai(n-2)

}