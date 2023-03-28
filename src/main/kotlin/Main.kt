
fun main() {
    val printpaypal = paypal("_", 1000, 2000)
    println(printpaypal)
}

fun paypal(card: String, history: Int, amount: Int): Any {
    val comissionMaster = 0
    val comissionMaster2 = amount * 0.006 + 20
    val comission1 = amount * 0.0075
    val comission2 = 35
    val limit = 75_000
    val LimitVisaDayAndMir = 150_000
    val comissionCard: Any = when (card) {
        "Maestro", "Mastercard" -> {
            when {
                history + amount <= limit -> {
                    "$comissionMaster"
                }

                history + amount > 600_000 -> "Превышены лимиты по карте"

                else -> {
                    "${comissionMaster2.toInt()}"
                }
            }

        }

        "VkPay" -> {
            "$comissionMaster"
        }

        else -> {

             if (comission1 > comission2) {

                    "${comission1.toInt()}"
                } else {
                    "$comission2"
                }


                   }
        }

    return comissionCard

}






