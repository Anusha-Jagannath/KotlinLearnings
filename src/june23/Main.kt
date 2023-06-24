package june23

fun main(args: Array<String>) {
    println("Learning hello world")
    var name: String = "steve"
    println(name)
    var person = Person()
    person.display(name)
    println("The name of the person is ${person.name}")
}

class Person {

    var name: String = ""

    fun display(name: String) {
        this.name = name
    }
}