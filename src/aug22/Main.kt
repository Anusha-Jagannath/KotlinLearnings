package aug22

fun main(args: Array<String>) {

    println("predicates in kotlin")
    val numbers = listOf<Int>(1, 2, 3, 4, 5, 6)
    val mySmallNums = numbers.filter { it -> it > 5 }
    println(mySmallNums)

    for (num in mySmallNums) {
        println(num)
    }

    val mySqauredNums1 = mySmallNums.map { it * it }
    println(mySqauredNums1)

    val pplList = listOf<Person>(Person(1,"name"), Person(2,"jkl"))
    println(pplList.filter { it -> it.nam.startsWith("A") })
}

class Person(var age: Int, var nam: String)