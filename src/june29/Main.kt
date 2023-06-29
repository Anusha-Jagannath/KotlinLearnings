package june29

fun main(args: Array<String>) {
    println("Learning loops in kotlin")

    for (i in 1..5) {
        println("Hello")
    }

    var person = Person()
    person.apply {
        name = "iop"
        age = 23
    }.startRun()


    with(person) {
        name = "yu"
        age = 23
    }
}

class Person {

    var name: String = ""
    var age: Int = -1

    fun startRun() {
        println("Person is running")
    }
}