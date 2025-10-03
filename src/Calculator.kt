import kotlin.random.Random

fun main() {
    print("Введите первое число, знак операции и второе число через пробел:")
    val input = readln().split(" ")
    val symbol = input[1]
    val firstNumber = input[0].toDouble()
    val secondNumber = input[2].toDouble()
    var result = 0.0
    when (symbol) {
        "/" -> result = firstNumber / secondNumber
        "*" -> result = firstNumber * secondNumber
        "+" -> result = firstNumber + secondNumber
        "-" -> result = firstNumber - secondNumber
        else -> println("Некорректный ввод")
    }

    println("$firstNumber $symbol $secondNumber = $result")

    // Шаг 8. Random
    println(Random.nextInt())
    println(Random.nextLong())
    println(Random.nextFloat())
    println(Random.nextDouble())

    println(Random.nextInt(until = 100))
    println(Random.nextInt(from = 1, until = 100))
    println(Random.nextInt(until = 100))
    println(Random.nextInt(from = 1, until = 100))
    println(Random.nextDouble(until = 5.0))
    println(Random.nextDouble(from = 0.0, until = 5.0))

    val target = Random.nextInt(1, 100)
    println("Угадай число от 1 до 100")
    while (true) {
        print("Введи число: ")
        val input = readln().toInt()

        when {
            input < target -> println("Загаданное число больше.")
            input > target -> println("Загаданное число меньше.")
            else -> {
                println("Поздравляю! Ты угадал число: $target")
                break
            }
        }
    }

    val dice1 = Random.nextInt(from = 1, until = 7)
    val dice2 = Random.nextInt(from = 1, until = 7)

    val sum = dice1 + dice2

    println("Первый кубик: $dice1")
    println("Второй кубик: $dice2")
    println("Сумма: $sum")
}

