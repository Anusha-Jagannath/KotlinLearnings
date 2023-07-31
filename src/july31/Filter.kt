package july31

fun main(args: Array<String>) {

    val myNumber = listOf<Int>(1, 2, 3, 4, 5)
    val newNumber = myNumber.filter { x -> x < 10 }
    println(newNumber)

    val mySquaredNums = myNumber.map { num -> num * num }
    println(mySquaredNums)

    val mySmallSquaredNums = mySquaredNums.filter { it < 10 }.map { it * it }

    var listOfPeople = listOf<Person>(Person(10, "jkl"), Person(20, "iop"))
    listOfPeople.filter { it -> it.age > 10 }


}

class Person(var age: Int, var name: String) {

}