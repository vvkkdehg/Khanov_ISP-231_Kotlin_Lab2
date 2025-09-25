fun main() {
    println("Hello, world!")

    print("Введите первое число: ")
    val number1 = readln().toInt()
    print("Введите второе число: ")
    val number2 = readln().toInt()
    if (number1 > number2){
        println("Число $number1 больше чем число $number2")
    }
    else {
        println("Число $number2 больше чем число $number1")
    }
    val max = if(number1 > number2) number1 else number2
    println("Максимальное число - $max")

    print("Введите возраст: ")
    val age = readln().toInt()
    val status = if(age >= 18) "Совершеннолетний" else "Несовершеннолетний"
    println(status)

    print("Введите урон: ")
    val damage = readln().toInt()
    print("Щит активен? (введите да или нет): ")
    val schit = readln().lowercase()
    var itog = damage
    if (schit == "да"){
        itog = damage / 2
    } else {
    itog = damage
    }
    println("Полученный урон: $itog")

    println("Введите уровень: ")
    val level = readln().toInt()
    println("Есть VIP-статус (true/false): ")
    val vip = readln().toBoolean()

    if ((level >= 30 && vip) || level >= 50){
        println("Доступ разрешён!")
    } else {
        println("Доступ запрещён!")
    }


    print("Введите порядковый номер месяца (1-12): ")
    val index = readln().toInt()
    var month = ""
    if (index == 1){
        month = "Январь"
    }
    else if (index == 2){
        month = "Февраль"
    } else if (index == 3){
        month = "Март"
    } else if (index == 4){
        month = "Апрель"
    } else if (index == 5){
        month = "Май"
    } else if (index == 6){
        month = "Июнь"
    } else if (index == 7){
        month = "Июль"
    } else if (index == 8){
        month = "Август"
    } else if (index == 9){
        month = "Сентябрь"
    } else if (index == 10){
        month = "Октябрь"
    } else if (index == 11){
        month = "Ноябрь"
    } else if (index == 12){
        month = "Декабрь"}
    if (index in 1..12){
        println("Вы ввели порядковый номер $index, ему соответсвует месяц $month.")
    }

}