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
}