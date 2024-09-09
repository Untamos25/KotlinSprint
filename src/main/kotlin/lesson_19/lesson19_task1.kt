package lesson_19

enum class FishType (val fishName: String, ) {
    GUPPY("гуппи"),
    ANGELFISH("скалярия"),
    GOLDFISH("золотая рыбка"),
    SIAMESE_FIGHTING_FISH("петушок")
}

fun main() {
    println("Доступные виды рыб:")
    FishType.entries.forEach { println(it.fishName) }
}