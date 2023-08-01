package Aug1

fun main(args: Array<String>) {
    println("Learning filters and maps")
    val myNumbers = listOf<Int>(1, 2, 3, 4, 5)
    val smallNumbers = myNumbers.filter { it -> it < 4 }
    println(smallNumbers)

    val secNumbers = myNumbers.filter { it -> it < 4 }.map { it -> it * 4 }

    secNumbers.forEach {
        println(it)
    }
    var peopleList = arrayListOf<Person>()
    peopleList.add(Person(10, "jkl"))
    peopleList.add(Person(11, "iop"))
    peopleList.add(Person(12, "yuio"))

    var secList =peopleList.filter { it -> it.age < 12 }.map { it -> it.age * 4 }
    println(secList)


}

class Person(val age: Int, val name: String) {

}