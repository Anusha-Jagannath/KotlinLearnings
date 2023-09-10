package sept8

fun main(args: Array<String>) {

    var person = Person()
    person.apply {
        name = "Sri"
        age = 23
    }

    var age = with(person) {
        println(name)
        println(age)
        age?.plus(5)
    }
    println(age)

    var numberList = mutableListOf<Int>(1, 2, 3)
    println(numberList)
    numberList.add(4)
    println(numberList)
    numberList.remove(3)

    numberList.also {
        println(it)
        it.add(4)
        println(it)
        it.remove(3)
        println(it)
    }

    person.also {
        it.name = "iop"
        it.age = 23
    }

    val name: String?= null
    println(name?.length)
    println(name?.reversed())

    val person1: Person ?= null
    person1?.run {
        println(name)
        println(age)
    }


}

class Person {

    var name: String? = null
    var age: Int? = null
}