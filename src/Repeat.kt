fun main() {
    println("Начинаем ритуал защиты!")
    var index = 0
    repeat(times=5) { index ->
        if (index == 2) {
            println("Пропускаем шаг ${index + 1} из-за магического вмешательства!")
            return@repeat
        }
        println("Заклинание защиты активировано! (Шаг ${index + 1})")
    }
    println("Замок защищен")

    val months = listOf("Python", "Kotlin", "C#", "C++", "Java")
    println(months[0])
    println(months.size)
    println("Kotlin" in months)

    val daysInMonth = listOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    print("Введите номер месяца: ")
    val input = readln().toInt()
    if (input in 1 .. 12) {
        val days = daysInMonth[input - 1]
        println("В этом месяце $days дней.")
    } else {
        println("Некорректный номер месяца.")
    }

    val lowercaseLetter: Char = 'a'
    val uppercaseLetter: Char = 'Q'
    val number: Char = '1'
    val space: Char = ' '
    val dollar: Char = '$'

    val ch = '\u0040'
    println(ch)

    val ch1 = 'a'
    println(ch1.code)
    val num = 91
    println(num.toChar())

    val ch2: Char = readln().first()

    val ch4 = 'b'
    val ch5 = ch4 + 1
    val ch6 = ch5 - 2

    var ch7 = 'A'
    ch7 += 10
    println(ch7)
    println(++ch7)
    println(++ch7)
    println(--ch7)

    println('a' < 'c')
    println('x' >= 'z')
    println('D' == 'D')
    println('Q' != 'q')
    println('A' < 'a')

    val one = '1'
    val isDigit = one.isDigit()
    val isLetter = one.isLetter()
    val capital = 'A'
    val small = 'e'
    val isLetterOrDigit = capital.isLetterOrDigit()
    val isUpperCase = capital.isUpperCase()
    val isLowerCase = capital.isLowerCase()
    val capitalEString = small.uppercase()
    val capitalE = small.uppercaseChar()

    println("one = $one")
    println("isDigit = $isDigit")
    println("isLetter = $isLetter")
    println("capital = $capital")
    println("small = $small")
    println("isLetterOrDigit = $isLetterOrDigit")
    println("isUpperCase = $isUpperCase")
    println("isLowerCase = $isLowerCase")
    println("capitalEString = $capitalEString")
    println("capitalE = $capitalE")
}