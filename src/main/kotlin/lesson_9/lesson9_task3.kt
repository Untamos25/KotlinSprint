package lesson_9

fun main() {

    val basicIngredientList = listOf(2, 50, 15)

    print("Какое количество порций вы хотите приготовить? ")
    var input: String? = readln()
    while (input == null || !input.matches(Regex("\\d+"))) {
        print("Недопустимое значение, попробуйте ещё раз.\nВведите целое число: ")
        input = readln()
    }
    val numberOfPortions = input.toInt()

    val finalIngredientList = basicIngredientList.map { it * numberOfPortions }

    println("""
        На $numberOfPortions порций вам понадобится:
         - яиц - ${finalIngredientList[0]} шт.
         - молока - ${finalIngredientList[1]} мл
         - сливочного масла - ${finalIngredientList[2]} г""".trimIndent())
}