package lesson_4

fun main() {

    val damageSerious = false
    val damageLight = false
    val favourableWeather = true
    val crewMin = 55
    val crewMax = 70
    val provisionMin = 50

    print("Корабль имеет серьёзные повреждения? (Да/Нет): ")
    val currentDamageSerious = readln().uppercase() == "ДА"

    print("Корабль имеет незначительные повреждения? (Да/Нет): ")
    val currentDamageLight = readln().uppercase() == "ДА"

    print("Погода благоприятная? (Да/Нет): ")
    val currentWeather = readln().uppercase() == "ДА"

    print("Количество человек в экипаже сейчас: ")
    val currentCrew = readln().toInt()

    print("Количество ящиков с провизией на борту: ")
    val currentProvision = readln().toInt()

    val isSailingTrue =
        (currentDamageSerious == damageSerious && currentDamageLight == damageLight && currentCrew >= crewMin && currentCrew <= crewMax && currentProvision > provisionMin) ||
                (currentDamageSerious == damageSerious && currentDamageLight != damageLight && currentWeather == favourableWeather && currentCrew == crewMax && currentProvision >= provisionMin)

    println("--------------------")
    if (isSailingTrue) println("Корабль может отправиться в плавание")
    else println("Плавание невозможно")

}
