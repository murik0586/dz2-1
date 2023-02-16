package ru.netology

fun main() {
    //val commission = 0.75% Добавить подсчет на то, что комимиссия вычитается. И также сделать else, где минимум
//если по сумме не выходит минимум 35 рублей.
    val amount = 10_000
    val doorstep = 4666 // комиссия 34.99, то что выше - э5
    val com = 0.0075
    val comission1 = amount * com
    val comission2 = 35
    val result =
     if (amount > doorstep)
     { comission1 //amount * com подсчет
    }
    else (comission2)
    println("Ваша комиссия при переводе: $result  рублей")
}





