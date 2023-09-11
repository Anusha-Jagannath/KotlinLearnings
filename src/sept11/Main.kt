package sept11

fun main(args: Array<String>) {
    println("Learning scope functions")
    var person = Person()
    println(person.name)
    println(person.age)

    var age = with(person) {
        println(person.name)
        println(person.age)
        age + 5
    }

    Person().apply {
        println(person.name)
        println(person.age)
    }

    val numberlist = mutableListOf<Int>(1, 2, 3, 4)
    val newNumbers = numberlist.also {
        numberlist.add(5)
        println(it)
        numberlist.add(3)

    }

    println(numberlist)
    println(newNumbers)


    println(age)

    val name: String? = null
    println(name?.length)
    println(name?.reversed())

}

class Person {
    var name: String = ""
    var age: Int = 0;
}