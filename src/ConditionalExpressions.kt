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
}