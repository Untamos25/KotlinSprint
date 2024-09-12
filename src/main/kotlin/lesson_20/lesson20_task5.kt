package lesson_20

class Robot {
    private var modifier: (String) -> String = { it }

    val listOfPhrases = listOf(
        "Привет, мир!",
        "Я вас не слышу и не хочу",
        "Сегодня в Москве +22 градуса, ясно понятно",
        "Я открою своё казино",
        "Спросите об этом у Сири",
    )

    fun say(listOfPhrases: List<String>) {
        println(modifier(listOfPhrases.random()))
    }

    fun setModifier(newModifier: (String) -> String) {
        modifier = newModifier
    }
}


fun main() {
    val robot = Robot()

    val reverseModifier = { it: String -> it.split(" ").reversed().joinToString(" ").reversed() }

    robot.say(robot.listOfPhrases)
    robot.setModifier(reverseModifier)
    robot.say(robot.listOfPhrases)
}