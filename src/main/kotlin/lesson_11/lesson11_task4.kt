package lesson_11

class RecipeCategory(
    var id: Int,
    var name: String,
    val imageUrl: String,
    var description: String,
    var recipes: List<Recipe>
)

class Recipe(
    var id: Int,
    var name: String,
    val imageUrl: String,
    var amountOfPortions: Int = 1,
    var ingredients: List<Ingredient>,
    var cookingMethod: String,
    var isFavourite: Boolean = false,
)

class Ingredient (
    var id: Int,
    var name: String,
    var amount: Int,
)