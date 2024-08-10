package lesson_9

fun main() {

    val omelette = listOf(2, 50, 15)    // Количество на 1 порцию омлета: яйца, молоко, масло
    val fewPortions = mutableListOf<Int>()

    print("Какое количество порций вы хотите приготовить? ")
    var input: String? = readln()
    while (input == null || !input.matches(Regex("\\d+"))) {
        print("Недопустимое значение, попробуйте ещё раз.\nВведите целое число: ")
        input = readln()
    }
    val answer = input.toInt()

    omelette.forEach { fewPortions.add(it * answer) }

    println(
        """
        
        На $answer порции вам потребуется
        Яиц - ${fewPortions[0]}
        Молока - ${fewPortions[1]}
        Сливочного масла - ${fewPortions[2]}""".trimIndent()
    )

}