package ru.netology

fun main() {
    val printpaypal = paypal("Maestro", 75000, 75001)
    println(printpaypal)
}
fun paypal(card : String, history: Int, amount : Int): String {
    val comissionMaster = 0
    val comissionMaster2 = amount * 0.006 + 20
    val comission1 = amount * 0.0075
    val comission2 = 35
    val limit = 75_000
    val comissionCard : String = when(card) {
        "Maestro","Mastercard" -> {
            when {
                history <= limit -> {
                "$comissionMaster"
                }
                else ->{
                    "$comissionMaster2"
                }
            }
        }
        "VkPay" -> { "$comissionMaster"}
         else -> {
          when {
              comission1 > comission2 -> {
                  "$comission1"
              }
                      else ->{
                          "$comission2"
                      }
              }
          }

    }
    return comissionCard

}





