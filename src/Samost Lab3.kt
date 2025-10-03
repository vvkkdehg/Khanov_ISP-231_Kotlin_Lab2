import kotlin.random.Random

fun main() {
    //Задание 1. Угадай число.
    val chislo = Random.nextInt(1, 50)
    println("Угадай число от 1 до 50")
    while (true) {
        print("Введи число: ")
        val input = readln().toInt()

        when {
            input < chislo -> println("Загаданное число больше.")
            input > chislo -> println("Загаданное число меньше.")
            else -> {
                println("Поздравляю! Ты угадал число: $chislo")
                break
            }
        }
    }

    println()
    //Задание 2. Счетчик гласных
    print("Введите русскую строку: ")
    val stroke = readln()
    var st = stroke
    var c = 0
    for (i in st) {
        if (i in "аоиеуяюэыАОИЕУЯЮЭЫ") {
            c += 1
        }
    }
    println("Гласных букв: $c")

    println()
    //Задание 3. Обратный отсчет
    print("Введите число n: ")
    var n = readln().toInt()
    while (n > 0) {
        println(n)
        n--
    }

    println()
    //Задание 4. Генератор пароля
    val bolsh = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val malen = "abcdefghijklmnopqrstuvwxyz"
    val cif = "0123456789"
    val sym = "!@#$%^&*()_+-=[]{}|;:,.<>?"
    val vse = bolsh + malen + cif + sym
    var parol = ""
    var m = Random.nextInt(8,16)
    for (i in 0..m) {
        parol += vse[Random.nextInt(0,vse.length)]
    }
    println("Ваш пароль - $parol")

    println()
    //Задание 5. Мини-опрос
    val otz = listOf("Ты крутой!", "Не слышал ничего лучше!", "Спасибо за ответ!", "Хорошая работа!")
    print("Введи свое имя: ")
    val name = readln()
    print("Какой твой любимый школьный предмет: ")
    val pred = readln()
    print("Есть ли у тебя домашние животные?: ")
    val zhiv = readln()
    print("Есть ли у тебя братья или сестры?: ")
    val brat = readln()
    println("Твое имя: $name")
    println("Твои ответы: \n$pred\n$zhiv\n$brat\n")
    println(otz[Random.nextInt(otz.size)])

    println()
    //Задание 6. Сумма чисел
    print("Введите число N: ")
    var N = readln().toInt()
    var summa = 0
    for (i in 1..N) {
        summa += i
    }
    println("Сумма чисел от 1 до $N - $summa")

    println()
    //Задание 7. Кубик D6
    for (i in 1..10) {
        println("$i-й бросок кубика - ${Random.nextInt(1,6)}")
    }

    println()
    //Задание 8. Слот-машина
    var a = 0
    var b = 0
    var b2 = 0
    for (i in 1..3) {
        val k = Random.nextInt(0,5)
        print("$k ")
        when (i) {
            1 -> a = k
            2 -> b = k
            3 -> b2 = k
        }
    }
    if (a == b && b == b2) {
        println("Джекпот!")
    }
    else{
        println("Повезет в другой раз!")
    }

    println()
    //Задание 9. Банковский счет
    var schet = Random.nextInt(100,1000)
    while (schet > 0) {
        val minus = Random.nextInt(10,100)
        if (minus > schet) {
            val g = schet
            schet -= schet
            println("Снято - $g, остаток на счету - $schet")
        }
        else{
            schet -= minus
            println("Снято - $minus, остаток на счету - $schet")
        }
    }

    println()
    //Задание 10. Прогноз погоды
    var d_n = ""
    var dni = "\n"
    for (i in 1..7) {
        when (i) {
            1 -> d_n = "Понедельник"
            2 -> d_n = "Вторник"
            3 -> d_n = "Среда"
            4 -> d_n = "Четверг"
            5 -> d_n = "Пятница"
            6 -> d_n = "Суббота"
            7 -> d_n = "Воскресенье"
        }
        val temp = Random.nextInt(-10,30)
        println("$d_n - $temp°C")
        if (temp < 0) {
            dni += "$d_n\n"
        }
    }
    println("Дни, когда температура была ниже нуля: $dni")
}