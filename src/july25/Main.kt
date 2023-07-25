package july25

fun main(args: Array<String>) {

    var student = Student()
    student.hasPassed(50)
    student.hasScholorship(90)


    val str1 = "Hello"
    val str2 = "world";
    var str3 = "hi"

    str3 = str3 + str2 + str1;
    println(str3)

    println(str3.add(str1, str2))

    val a = 5;
    val b = 6;
    println(a.greater(b))
}


fun String.add(s1: String, s2: String): String {
    return this + s1 + s2;
}


class Student {

    fun hasPassed(marks: Int): Boolean {
        return marks > 50
    }
}

fun Student.hasScholorship(marks: Int): Boolean {
    return marks > 90
}

fun Int.greater(b: Int): Int {
    if (this > b) return this else return b
}