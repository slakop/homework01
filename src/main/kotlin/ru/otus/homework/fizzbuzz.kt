package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    var i = 0;
    val numbers = Array(n, { i++}) // Создается массив чисел от 0 размерностью n
    val result: Array<String> = Array(n) { "" } // Создается выходной массив размерностью n
    val Fizz = "Fizz"
    val Buzz = "Buzz"

    for(i in 0..numbers.lastIndex){
        when{
            (numbers[i] == 0) -> result[0]=Fizz+Buzz  // 0
            (numbers[i] % 3 == 0) && (numbers[i] % 5 == 0) -> result[i]=Fizz+Buzz // Кратно  3 и 5
            (numbers[i] % 3 == 0) -> result[i]=Fizz   // Кратно 3
            (numbers[i] % 5 == 0) -> result[i]=Buzz   // Кратно 5
            else -> result[i]="${numbers[i]}"         // Все остальные значения
        }
    }

    return result
}