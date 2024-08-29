package lesson_16

private const val PLAYER_MAX_HP = 100
private const val PLAYER_STRENGTH = 40
private const val MEDKIT_POINTS = 50

private const val ENEMY_HEALTH_MIN = 40
private const val ENEMY_HEALTH_MAX = 120
private const val ENEMY_STRENGTH_MIN = 10
private const val ENEMY_STRENGTH_MAX = 60

private const val ESCAPE_DICE_SIDES = 6
private const val ESCAPE_SUCCESS_THRESHOLD = 4


// Интерфейс для сущностей, обладающих здоровьем
interface HasHealth {
    fun getHealth(): Int    // Возвращает текущее значение здоровья
}

// Интерфейс для сущностей, которые могут получать урон
interface Damageable {
    fun takeDamage(damage: Int)    // Применяет урон к сущности
}


class Player(
    val name: String,
    private var health: Int = PLAYER_MAX_HP,
    private var strength: Int = PLAYER_STRENGTH,
    var numberOfMedkits: Int = 1,
) : HasHealth, Damageable {

    // Возвращает текущее значение здоровья игрока
    override fun getHealth(): Int = health

    // Возвращает силу атаки игрока
    fun getStrength(): Int = strength

    // Выводит текущие характеристики игрока (здоровье, сила, количество аптечек)
    fun checkStatus() {
        println("\nТекущие показатели персонажа $name\nHP: $health / Сила: $strength / Аптечки: $numberOfMedkits шт.")
    }

    // Использование аптечки
    fun useMedkit() {
        if (health <= 0) {
            println("$name уже мёртв и не может лечиться.")
            return
        }
        if (numberOfMedkits <= 0) {
            println("$name не имеет аптечек в инвентаре.")
            return
        }
        numberOfMedkits--
        health += MEDKIT_POINTS
        if (health >= PLAYER_MAX_HP) {
            health = PLAYER_MAX_HP
            println("$name полностью себя вылечил.")
        } else println("$name успешно вылечил себя на $MEDKIT_POINTS очков здоровья.")
    }

    // Применяет урон к игроку
    override fun takeDamage(damage: Int) {
        if (health > 0) {
            if (health - damage > 0) {
                health -= damage
                println("$name получил $damage урона. Осталось $health HP.")
            } else die()
        }
    }

    // Обработка смерти игрока
    private fun die() {
        health = 0
        strength = 0
        println("Противник нанёс персонажу $name травмы, несовместимые с жизнью.\nНа этом его приключения закончились.")
    }

    // Попытка сбежать из боя
    fun escapeFromBattle(): Boolean {
        println("$name пытается сбежать...")
        val diceRoll = (1..ESCAPE_DICE_SIDES).random()
        Thread.sleep(1000)
        return if (diceRoll > ESCAPE_SUCCESS_THRESHOLD) {
            println(
                "Персонажу $name удалось скрыться!\n" +
                        "Никто не узнает об этом незначительном акте здравого смысла перед лицом опасности.\n" +
                        "$name стоит в раздумьях..."
            )
            true
        } else {
            println(
                "$name разворачивается и стремительно уползает прочь, " +
                        "но противник хватает вашего персонажа за ногу и тащит к себе."
            )
            false
        }
    }

    // Отображает меню с опциями и возвращает выбранный вариант
    fun showMenuAndSelectOption(options: List<String>): Int {
        println("Что вы хотите сделать:")
        println(options.joinToString("\n") { " ${options.indexOf(it) + 1} - $it" })
        var input: String? = readln()
        while (input == null || !input.matches(Regex("\\d+")) || input.toInt() !in 1..options.size) {
            println(
                "Всё замерло вокруг, пока персонаж раздумывает о том, что делать дальше...\n" +
                        "А вы пока укажите номер действия, которое хотите выполнить: "
            )
            input = readln()
        }
        return input.toInt()
    }

    // Выбор действия в бою
    fun selectBattleOption(player: Player, enemy: Enemy): Int {
        val options = listOf("Атаковать", "Использовать аптечку", "Сбежать из боя")
        val answer = showMenuAndSelectOption(options)
        when (answer) {
            1 -> enemy.takeDamage(player.getStrength())
            2 -> useMedkit()
        }
        return answer
    }

    // Выбор действия вне боя
    fun selectOption(): Int {
        val options = listOf("Продолжить путь", "Использовать аптечку и пойти дальше", "Выйти из подземелья")
        val answer = showMenuAndSelectOption(options)
        if (answer == 2) useMedkit()
        return answer
    }
}


class Enemy : HasHealth, Damageable {
    // Списки названий и прозвищ для генерации имени врага
    val listOfNames =
        listOf("гоблин", "упырь", "огр-шептун", "скрежетун", "тролль", "барабашка", "орк-воришка", "слизень")
    val listOfSubNames = listOf("Свинорылый", "Мерзкий", "Раздутый", "Пупырчатый", "Гнилостный", "Земляной", "Вонючий")
    var name = "${listOfSubNames.random()} ${listOfNames.random()}"
    private var health = (ENEMY_HEALTH_MIN / 10..ENEMY_HEALTH_MAX / 10).random() * 10
    private var strength = (ENEMY_STRENGTH_MIN / 10..ENEMY_STRENGTH_MAX / 10).random() * 10

    // Возвращает текущее значение здоровья врага
    override fun getHealth(): Int = health

    // Возвращает силу атаки врага
    fun getStrength(): Int = strength

    // Применяет урон к врагу
    override fun takeDamage(damage: Int) {
        if (health > 0) {
            if (health - damage > 0) {
                health -= damage
                println("Противнику нанесен $damage урона. У противника осталось $health HP.")
            } else {
                health = 0
                println("Противник повержен.")
            }
        }
    }
}

// Функция, реализующая логику боя между игроком и врагом
fun startBattle(player: Player, enemy: Enemy): Int {
    var deadEnemyCounter = 0
    println("\nВам повстречался ${enemy.name} с хактеристиками\nHP: ${enemy.getHealth()} / Сила: ${enemy.getStrength()}")
    while (player.getHealth() > 0 && enemy.getHealth() > 0) {
        val answer = player.selectBattleOption(player, enemy)
        if (answer == 3) {
            if (player.escapeFromBattle()) return deadEnemyCounter
        }
        if (enemy.getHealth() > 0) player.takeDamage(enemy.getStrength()) else deadEnemyCounter++
    }
    return deadEnemyCounter
}


fun main() {
    print("Введите имя вашего персонажа: ")
    val name = readln()
    val player = Player(name)
    var answer: Int
    var deadEnemyCounter = 0
    println(
        "$name вошёл в подземелье с целью убить как можно больше врагов. " +
                "И где-то недалеко уже притаились противники..."
    )

    do {
        player.checkStatus()
        val enemy = Enemy()
        deadEnemyCounter += startBattle(player, enemy)
        if (player.getHealth() > 0) {
            player.checkStatus()
            answer = player.selectOption()
        } else break
    } while (answer != 3)

    if (player.getHealth() > 0) println("$name живой выбрался из подземелья.")
    else println(
        "$name навсегда остался в подземелье. " +
                "И даже хорошо, что вы не знаете, что сейчас делают враги с его бездыханным телом."
    )
    println("\nЗа время прохождения подземелья убито врагов: $deadEnemyCounter")
}




/*
private const val PLAYER_MAX_HP = 100
private const val PLAYER_STRENGTH = 40

class Player(
    val name: String,
    private var health: Int = PLAYER_MAX_HP,
    private var strength: Int = PLAYER_STRENGTH
) {

    fun takeDamage(damage: Int) {
        println("$name получил $damage урона.")
        if (health > 0) {
            if (health - damage > 0) {
                health -= damage
                println("Осталось $health HP.")
            } else die()
        }
    }

    fun heal(healPoints: Int) {
        if (health <= 0) {
            println("$name уже мёртв и не может лечиться.")
            return
        }
        health += healPoints
        if (health >= PLAYER_MAX_HP) {
            health = PLAYER_MAX_HP
            println("$name полностью вылечился.")
        } else
        println("$name вылечился на $healPoints HP. Текущее здоровье: $health")
    }

    private fun die() {
        health = 0
        strength = 0
        println("Персонаж $name погиб.")
    }
}

fun main() {
    val player = Player("Герой")

    player.takeDamage(30)
    player.heal(20)
    player.takeDamage(40)
    player.takeDamage(50)
    player.heal(100)
}

*/
