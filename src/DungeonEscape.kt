fun main() {
    var level = 0
    println("Добро пожаловать в Подземелье")
    while (level < 5) {
        println("\nВы на уровне $level")
        println("Выберите действие: [1] Вперёд | [2] Осмотреться |0] Сдаться")
        val input = readLine()
        when (input) {
            "1" -> {
                level++
                println("Вы переходите на уровень $level")
            }

            "2" -> {
                println("Вы осматриваетесь. Тут нечего интересного")
                continue
            }

            "0" -> {
                println("Вы сдались. Игра окончена.")
                break
            }

            else -> {
                println("Неверный ввод. Попробуйте снова.")
                continue
            }
        }
        if (level == 5)
            println("Поздравляем! Вы выбрались из подземелья")
    }

    //Шаг 4. Цикл do...while
    var number: Int
    do {
        print("Введите число больше 10: ")
        number = readln().toInt()
    } while (number <= 10)

    println("Спасибо! Вы ввели $number.")

    var password: String?
    do {
        print("Введите пароль: ")
        password = readln()
    } while (password != "qwerty")

    println("Доступ разрешён!")

    //Шаг 5. Цикл for
    for (i in 1..5 ) {
        println("Шаг $i")
    }

    val fruits = listOf("apple", "banana", "cherry")
    for (fruit in fruits) {
        println("Фрукт: $fruit")
    }

    //Шаг 6. Метод split()
    val sentence = "Kotlin is awesome"
    val words = sentence.split(" ")
    println(words)

    val data = "apple,banana,orange"
    val frukts = data.split(",")
    for (fruit in frukts){
        println(fruit)
    }

    val messy = "word1,word2;word3|word4"
    val parts = messy.split(",", ";", "|")
    println(parts)

    val fullName = "Иванов Иван"
    val parts2 = fullName.split(" ")
    val lastName = parts2[0]
    val firstName = parts2[1]
    println("Фамилия: $lastName, Имя: $firstName")

    print("Введите числа через пробел: ")
    val input2 = readln()
    val numbers = input2.split(" ")
    var sum = 0
    for (number in numbers) {
        sum += number.toInt()
    }
    println("Сумма чисел: $sum")

}