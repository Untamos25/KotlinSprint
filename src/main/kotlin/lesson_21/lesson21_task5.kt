package lesson_21

interface Map {
    val categories: kotlin.collections.Map<String, Int>
}

class Character(override val categories: kotlin.collections.Map<String, Int>) : Map

fun Map.maxCategory(): String? = this.categories.maxByOrNull { it.value }?.key


fun main() {
    val character = Character(mapOf("Сила" to 10, "Ловкость" to 15, "Интеллект" to 15, "Выносливость" to 15))
    println(character.maxCategory())
}