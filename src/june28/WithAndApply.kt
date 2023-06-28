package june28

fun main(args: Array<String>) {
    println("learning with and apply")
    val person = Person()
    person.apply {
        name = "kl"
        age = 2
    }.startRun()

    with(person) {
        name = "op"
        age = 3
    }
}

class Person {

    var name: String = ""
    var age: Int = -1

    fun startRun() {
        println("person is running")
    }
}