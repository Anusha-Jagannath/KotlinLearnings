package july26

fun main(args: Array<String>) {
    println("Learning extension function")
    var student = Student()
    student.hasPassed(100)
    student.hasSchlorship(90)

    var str1 = "helo"
    var str2 = "iop"
    var str3 = "iuy"
    str3 = str1 + str2 + str3;
    println(str3)
    println(str3.concat(str1, str2))

    val x = 6
    val y = 10
    println(x.findGreaterNumber(y))

}

fun Int.findGreaterNumber(b: Int): Int {
    if (this > b) return this else return b
}

fun String.concat(s1: String, s2: String): String {
    return this + s1 + s2;
}

fun Student.hasSchlorship(marks: Int): Boolean {

    if (marks > 90) return true;
    else return false;
}


class Student {

    fun hasPassed(marks: Int): Boolean {
        if (marks > 90) return true;
        else return false;
    }
}