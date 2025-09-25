fun main() {
    //Задание 1
    println("Задание 1. Проверка уровня доступа игрока")
    print("Введите ваш уровень: ")
    val lvl = readln().toInt()
    if (lvl in 1 until 10) {
        println("Новичок! Вы получаете +10 HP")
    }
    else if (lvl in 10 .. 50) {
        println("Опытный! Вы получаете +30 HP")
    }
    else if (lvl > 50) {
        println("Легенда! Вы получаете +100 HP")
    }
    else {
        println("Некорректный уровень")
    }

    println()
    //Задание 2
    println("Задание 2. Проверка возраста")
    print("Введите ваш возраст: ")
    val age = readln().toInt()
    if (age in 0 until 12) {
        println("Вы ребенок")
    }
    else if (age in 12 .. 17) {
        println("Вы подросток")
    }
    else if (age > 17) {
        println("Вы взрослый")
    }
    else {
        println("Вы не человек!")
    }

    println()
    //Задание 3
    println("Задание 3. Проверка диапазона")
    print("Введите число от 1 до 100: ")
    val ch = readln().toInt()
    if (ch in 10 .. 50 ) {
        println("Входит в диапазон")
    }
    else {
        println("Не входит в диапазон")
    }

    println()
    //Задание 4
    println("Задание 4. Распознавание символа")
    print("Введите символ: ")
    val input = readln()
    val char = input[0]
    when (char) {
        in '0' .. '9' -> println("Цифра")
        in 'a' .. 'z', in 'A' .. 'Z' -> println("Буква латинского алфавита")
        ' ' -> println("Пробел")
        else -> println("Спецсимвол")
    }

    println()
    //Задание 5
    println("Задание 5. Таблица умножения")
    var um = 1
    repeat(times = 10) {
        println("5 * $um = ${5 * um}")
        um++
    }

    println()
    //Задание 6
    println("Задание 6. Коллекция любимых фильмов")
    val films = listOf("Сваты", "Один дома", "Иван Васильевич меняет профессию", "Девчата", "Брилиантовая рука")
    for (i in films) {
        println(i)
    }
    println()
    for (i in films) {
        println("Длина названия фильма '$i' - ${i.length}")
    }

    println()
    //Задание 7
    println("Задание 7. Создайте программу-миниопрос")
    print("Как вас зовут?: ")
    val name = readln()
    print("Сколько вам лет?: ")
    val voz = readln().toInt()
    print("Какой ваш любимый цвет?: ")
    val cvet = readln()
    var god = "год"
    when (voz % 10) {
        1 -> god = "год"
        in 2..4 -> god = "года"
        else -> god = "лет"
    }
    println("Привет, $name! Тебе $voz $god, и ты любишь $cvet.")
}