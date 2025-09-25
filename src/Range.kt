fun main() {
    val numbers = 1 .. 100
    val symbol = 'a' .. 'z'

    print("Введите ваш уровень: ")
    val lvl = readln().toInt()
    if (lvl in 1..50){
        println("Уровень $lvl соответствует требованиям! Вы можете зайти в данж!")
    } else{
        println("Высокий уровень! Вход запрещён!")
    }

    val d1 = 'z' downTo 'a'
    val d2 = 5 until 11
    val d3 = 10 .. 50 step 3

}