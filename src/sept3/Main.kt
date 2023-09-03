package sept3


fun main(args: Array<String>) {

}

class Human {

    private var _age: Int = 0;
    public var age: Int

        get() {
            return _age;
        }

        set(value) {
            _age = value
        }


}

class Student {
    private val _hobbies = mutableListOf<String>()
    val hobbies = _hobbies as List<String>


}