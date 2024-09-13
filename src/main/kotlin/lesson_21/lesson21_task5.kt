package lesson_21

interface Map {
    val Categories: kotlin.collections.Map<String, Int>
}

class Character(override val Categories: kotlin.collections.Map<String, Int>) : Map

fun Map.maxCategory(): String {
    val maxValue = this.Categories.entries.maxBy { it.value }
    val allCategoriesWithMaxValues = this.Categories.filter { it.value == maxValue.value }
    return if (allCategoriesWithMaxValues.size > 1) {
        allCategoriesWithMaxValues.toList().shuffled()[0].first
    } else {
        maxValue.key
    }
}

fun main() {
    val character = Character(mapOf("Сила" to 10, "Ловкость" to 15, "Интеллект" to 15, "Выносливость" to 15))
    println(character.maxCategory())
}