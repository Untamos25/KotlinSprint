package lesson_21

interface Map {
    val categories: kotlin.collections.Map<String, Int>
}

class Character(override val categories: kotlin.collections.Map<String, Int>) : Map

fun Map.maxCategory(): String? {
    val mostExperiencedCategories =
        this.categories.filter { currentCategory -> currentCategory.value == categories.maxByOrNull { it.value }?.value }
    return mostExperiencedCategories.toList().randomOrNull()?.first
}

fun main() {
    val character = Character(mapOf("Сила" to 10, "Ловкость" to 15, "Интеллект" to 15, "Выносливость" to 15))
    println(character.maxCategory())
}