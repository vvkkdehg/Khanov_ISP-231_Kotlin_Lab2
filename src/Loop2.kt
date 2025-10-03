fun main() {
    var number = 1
    while (number <= 5) {
        println("Число: $number")
        number++
    }
    //Шаг 2. Операторы continue и break
    var num = 1
    while (num <= 10) {
        println(num)
        num++
        if (num == 5) {
            println("Останавливаемся на $num")
            break
        }
        if (num == 3) {
            println("Останавливаемся на $num")
            continue
        }
        println(num)
    }
    println("Напишите что-нибудь (для выхода введите 'выход');")

    while (true) {
        val input = readLine()
        if (input == "выход") {
            println("До свидания!")
            break
        }
        println("Вы ввели: $input")
    }

    var letter = 'A'
    while (letter <= 'Z'){
        print(letter)
        letter++
    }

    //Шаг 3. Побег из подземелья

}