import kotlin.math.pow

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    /* Задача 1: Четное или нечетное число
    val number = readLine()!!.toInt()
    if (number % 2 == 0) {
        println("Четное число")
    } else {
        println("Нечетное число")
    }
    */

    /* Задача 2: Минимальное из трех чисел
    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()
    val num3 = readLine()!!.toInt()

    if(num1 < num2 && num1 < num3) println(num1)
    else if(num2 < num1 && num2 < num3)  println(num2)
    else println(num3)
    */

    /* Задача 3: Таблица умножения
    for (i in 1..10) {
        println("5 * $i = ${5 * i}")
     */

    /* Задача 4: Сумма чисел от 1 до N
    val n = readLine()!!.toInt()
    var sum = 0
    for (i in 1..n) {
        sum += i
    }
    println("Сумма: $sum")
     */

    /* Задача 5: Число Фибоначчи
    val n = readLine()!!.toInt()
    var a = 0
    var b = 1
    for (i in 1..n) {
        println(a)
        val temp = a
        a = b
        b = temp + b
    }
     */

    /* Задача 6: Проверка простого числа
    val num = readLine()!!.toInt()
    var Prime = true
    if (num <= 1) Prime = false
    for (i in 2 until num) {
        if (num % i == 0) {
            Prime = false
            break
        }
    }
    if (Prime) {
        println("$num — простое число")
    } else {
        println("$num — не простое число")
    }
     */

    /* Задача 7: Обратный порядок чисел
    val n = readLine()!!.toInt()
    for (i in n downTo 1) {
        println(i)
    }
     */

    /* Задача 8: Сумма четных чисел
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    var sum = 0
    for (i in a..b) {
        if (i % 2 == 0) {
            sum += i
        }
    }
    println("Сумма четных чисел: $sum")
     */

    /* Задача 9: Реверс строки
    val str = readLine()!!
    val reverse = str.reversed()
    println("Обратный порядок строки: $reverse")
     */

    /* Задача 10: Количество цифр в числе
    val number = readLine()!!.toInt()
    val Count = number.toString().length
    println("Количество цифр: $Count")
     */

    /* Задача 11: Факториал числа
    val n = readLine()!!.toInt()
    var factorial = 1
    for (i in 1..n) {
        factorial *= i
    }
    println("Факториал равен: $factorial")
     */

    /* Задача 12: Сумма цифр числа
    val num = readLine()!!.toInt()
    var sum = 0
    var temp = num
    while (temp != 0) {
        sum += temp % 10
        temp /= 10
    }
    println("Сумма: $sum")
     */

    /* Задача 13: Палиндром
    val str = readLine()!!
    val reversedStr = str.reversed()
    if (str == reversedStr) {
        println("Строка палиндром")
    } else {
        println("Строка не палиндромом")
    }
     */

    /* Задача 14: Найти максимальное число в массиве
    val size = readLine()!!.toInt()
    val num = IntArray(size)
    println("Введите элементы массива:")
    for (i in 0 until size) {
        num[i] = readLine()!!.toInt()
    }
    val max = num.maxOrNull()
    println("Максимальное число: $max")
     */

    /* Задача 15: Сумма всех элементов массива
    val size = readLine()!!.toInt()
    val num = IntArray(size)
    println("Введите элементы массива:")
    var sum = 0
    for (i in 0 until size) {
        num[i] = readLine()!!.toInt()
        sum += num[i]
    }
    println("Сумма всех элементов массива: $sum")
     */

    /* Задача 16: Количество положительных и отрицательных чисел
    val size = readLine()!!.toInt()
    val numbers = IntArray(size)
    var positive = 0
    var negative = 0
    println("Введите элементы массива:")
    for (i in 0 until size) {
        numbers[i] = readLine()!!.toInt()
        if (numbers[i] > 0) positive++
        if (numbers[i] < 0) negative++
    }
    println("Положительных чисел: $positive")
    println("Отрицательных чисел: $negative")
     */

    /* Задача 17: Простые числа в диапазоне
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    for (i in a..b) {
        var isPrime = true
        if (i <= 1) continue
        for (j in 2 until i) {
            if (i % j == 0) {
                isPrime = false
                break
            }
        }
        if (isPrime) {
            println(i)
        }
    }
     */

    /* Задача 18: Подсчет гласных и согласных в строке
    val str = readLine()!!
    var vowels = 0
    var consonants = 0
    val vowelsSet = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')

    for (ch in str) {
        if (ch.isLetter()) {
            if (ch in vowelsSet) vowels++ else consonants++
        }
    }

    println("Гласных: $vowels, Согласных: $consonants")
     */


    /* Задача 19: Перестановка слов в строке
    val str = readLine()!!
    val words = str.split(" ")
    val reverse = words.reversed().joinToString(" ")
    println("Строка с переставленными словами: $reverse")
     */

    /* Задача 20: Число Армстронга
    val num = readLine()!!.toInt()
    val digits = num.toString().length
    var sum = 0
    var temp = num
    while (temp != 0) {
        val digit = temp % 10
        sum += digit.toDouble().pow(digits).toInt()
        temp /= 10
    }
    if (sum == num) {
        println("$num число Армстронга")
    } else {
        println("$num не Армстронга")
    }
     */
}