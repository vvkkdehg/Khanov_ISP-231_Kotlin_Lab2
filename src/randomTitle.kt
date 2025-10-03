fun main() {
    val part1 = arrayOf("Опытный", "Безумный", "Легендарный", "Скрытый", "Гигачад")
    val part2 = arrayOf("стрелок", "геймер", "воин", "волшебник", "трейдер")
    val part3 = arrayOf("из CS60", "на максималках", "из будущего", "в бане у Габена", "с проклятым лутом")
    val rand1 = (Math.random() * part1.size).toInt()
    val rand2 = (Math.random() * part2.size).toInt()
    val rand3 = (Math.random() * part3.size).toInt()
    val phrase = "${part1[rand1]} ${part2[rand2]} ${part3[rand3]}"
    println("Ваш титул: $phrase")
}