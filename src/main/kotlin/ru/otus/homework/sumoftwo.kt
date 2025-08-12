package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    var result = intArrayOf(-1) // Выходной массив
    for(x in 0..numbers.lastIndex){
        for(y in 0..numbers.lastIndex){
            if ((x != y) && (numbers[x] + numbers[y] == target))
            {
                if (result[0] == -1) // Если массив пустой т.е. элемент -1 замещаем его
                    result[0] = x
                else
                    result += x     // Если не пустой  - добавляем
            }
        }
    }

    // Если не нашлось элементов выкидываем исключение
    if (result[0] == -1)
        throw IllegalArgumentException("Array is empty")

    return result
}