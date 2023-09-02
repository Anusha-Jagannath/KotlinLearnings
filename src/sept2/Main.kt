package sept2

fun main(args: Array<String>) {

    val country = Country()
    country.name = "India"
    val pi: Float = 3.14f
    val area = pi * 3.14 * 3.14
}

class Country {

    lateinit var name: String
}