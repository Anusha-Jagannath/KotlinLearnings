package june22

fun main(args: Array<String>) {
    println("Learning kotlin")
    display("hello")

    var person = Person()
    person.name = "jkl"
    println("The name of the person is ${person.name}")
    person.display()


}

fun display(name: String) {
    println(name)
}

class Person {

    var name: String = ""

    fun display() {
        println(name)
    }
}