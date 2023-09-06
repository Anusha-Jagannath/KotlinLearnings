package sept6


fun main(args: Array<String>) {
    println("Learning backing property")

}

class Human {

    var age: Int = 0
}

class Human2 {

    private var _age: Int = 0;
    var age: Int = _age
}

