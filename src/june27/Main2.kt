package june27

fun main(args: Array<String>) {
    var person = Person()
    with(person) {
        name = "iop"
        age = 3
    }

    person.apply {
        name = "iuy"
        age = 7
    }
}


class Person {

    var name: String = ""
    var age: Int = -1

}