package aug26

fun main(args: Array<String>) {
    val numbers = listOf<Int>(1, 3, 2, 1, 4, 5);
    val smallnumbers = numbers.filter { it -> it > 4 }
    for (data in smallnumbers) {
        println(smallnumbers)
    }
    val squaredNumbers = numbers.map { it -> it * it }
    println(squaredNumbers)

    var peopleList = listOf<Person>(Person(1, "jkl"), Person(2, "nmk"))
    peopleList.filter { it -> it.name.startsWith("j") }

    var result = numbers.all { num -> num > 10 }
    println(result)

    var result2 = numbers.any { it -> it > 5 }
    var result3 = numbers.count { it -> it > 5 }
    println(result2)
    println(result3)


}

class Person(var age: Int, var name: String)