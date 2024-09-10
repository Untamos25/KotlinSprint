package lesson_20

fun main() {
    val listOfElements = listOf("Кнопка 1", "Кнопка 2", "Кнопка 3", "Кнопка 4", "Кнопка 5", "Кнопка 6")

    val mapOfLambdas = listOfElements.map { element -> { it: String -> "Нажат элемент $it" }(element) }

    mapOfLambdas.forEachIndexed { index, lambda ->
        if ((index + 1) % 2 == 0) println(lambda)
    }
}