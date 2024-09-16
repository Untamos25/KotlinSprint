package lesson_22

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

data class GalacticGuide(
    val name: String,
    val description: String,
    val dateTime: LocalDateTime,
    val distanceFromEarth: Double
)

fun main() {
    val formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm")

    val alphaCentauri = GalacticGuide(
        name = "Альфа Центавра",
        description = "Ближайшая к Солнечной системе звездная система, " +
                "состоящая из трех звезд: Альфа Центавра A, Альфа Центавра B и Проксима Центавра.",
        dateTime = LocalDateTime.of(1997, 9, 1, 9, 18),
        distanceFromEarth = 4.36
    )

    val name = alphaCentauri.component1()
    val description = alphaCentauri.component2()
    val dateTime = alphaCentauri.component3()
    val distanceFromEarth = alphaCentauri.component4()

    println("Название: $name")
    println("Описание: $description")
    println("Земная дата и время события: ${dateTime.format(formatter)}")
    println("Расстояние от Земли: $distanceFromEarth световых лет")
}