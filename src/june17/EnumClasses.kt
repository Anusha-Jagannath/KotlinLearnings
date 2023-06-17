package june17

fun main(args: Array<String>) {
    println("Learning enum classes")
    val value = CreditCardType.GOLD

    val myConstants = CreditCardType.values()
    myConstants.forEach {
        println(it)
    }

    when (value) {
        CreditCardType.GOLD -> println("gold")
        CreditCardType.SILVER -> println("silver")
        CreditCardType.PLATINUM -> println("platinum")
    }

    println(value.getCashbackValue())


}

enum class CreditCardType(val color: String, val maxLimit: Int = 1000) : ICardCashback {
    GOLD("gray", 50000) {
        override fun getCashbackValue(): Float {
            return 0.4f
        }
    },
    SILVER("white") {
        override fun getCashbackValue(): Float {
            TODO("Not yet implemented")
        }
    },
    PLATINUM("blue") {
        override fun getCashbackValue(): Float {
            return 0.3f
        }
    }
}

interface ICardCashback {
    fun getCashbackValue(): Float
}