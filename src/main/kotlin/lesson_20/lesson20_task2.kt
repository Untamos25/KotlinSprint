package lesson_20

class Player(
    val name: String,
    val maxHealthPoints: Int,
    var currentHealthPoints: Int,
)


fun main() {
    val player = Player("Фродо", 100, 54)
    println(
        """
        Информация о персонаже:
        Имя: ${player.name}
        Текущее здоровье: ${player.currentHealthPoints} / ${player.maxHealthPoints}
        
    """.trimIndent()
    )

    val restoreHealth: (Player) -> Unit = {
        println("${player.name} использует зелье лечения.\n")
        it.currentHealthPoints = it.maxHealthPoints
    }
    restoreHealth(player)

    println(
        """
        Информация о персонаже:
        Имя: ${player.name}
        Текущее здоровье: ${player.currentHealthPoints} / ${player.maxHealthPoints}
        
    """.trimIndent()
    )
}