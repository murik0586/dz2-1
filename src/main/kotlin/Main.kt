package ru.netology

fun main() {
    val printpaypal = paypal("_", 0, 76000)
    println(printpaypal)
}
fun paypal(card : String, history: Int, amount : Int): String {
    var comissionMaster = 0
    val doorstep = 4666
    val com = 0.0075
    val comission1 = amount * com
    val comission2 = 35

    var comissionCard : String = when {
        card == "Maestro" || card == "Mastercard" -> {
            when {
                amount <= 75000 -> {
                "$comissionMaster"
                }
                else ->{
                    var comissionMaster = amount* 0.006 + 20
                    "$comissionMaster"
                }
            }
        }
        card == "VkPay" -> { "$comissionMaster"}
        else -> {
          when {
              amount <= 4666 -> {
                  "$comission2"
              }//amount * com подсчет
                      else ->{
                          "$comission1"
                      }
              }
          }
    }
    return comissionCard

}





