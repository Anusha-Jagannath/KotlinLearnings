package aug15

fun main(args: Array<String>) {
    println("Learning filter and map in kotlin")
    val myNumbers = arrayListOf<Int>(1, 2, 3, 4, 5)
    val filteredList = myNumbers.filter { x -> x < 10 }
    println(filteredList)

    val mySquaredNumbers = filteredList.map { x -> x * x }
    for (data in mySquaredNumbers) {
        println(mySquaredNumbers)
    }

    var myppl = listOf<Person>(Person(1, "kl"), Person(2, "ui"), Person(30, "yut"))
    println(myppl.filter { x -> x.age > 4 }.filter { x -> x.name.startsWith('j') })

}

class Person(var age: Int, var name: String)