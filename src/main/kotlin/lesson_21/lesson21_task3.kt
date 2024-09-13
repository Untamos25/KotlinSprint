package lesson_21

class Player(
    val name: String,
    val maxHealthPoints: Int,
    var currentHealthPoints: Int,
)

fun Player.isHealthy(): Boolean {
    return (this.currentHealthPoints == this.maxHealthPoints)
}

fun main() {
    val player1 = Player("Фродо", 100, 80)
    val player2 = Player("Сэм", 100, 100)

    println("${player1.name} здоров? ${player1.isHealthy()}")
    println("${player2.name} здоров? ${player2.isHealthy()}")
}