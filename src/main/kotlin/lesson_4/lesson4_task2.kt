package lesson_4

const val AVERAGE_WEIGHT_MIN_KG = 35
const val AVERAGE_WEIGHT_MAX_KG = 100
const val AVERAGE_VOLUME_MAX = 100

fun main() {

    val cargoWeightKgVolumeL1 = arrayOf(20, 80)
    val cargoWeightKgVolumeL2 = arrayOf(50, 100)

    println(
        "Груз с весом ${cargoWeightKgVolumeL1[0]} кг и объемом ${cargoWeightKgVolumeL1[1]} л " +
                "соответствует категории 'Average': ${
                    cargoWeightKgVolumeL1[0] > AVERAGE_WEIGHT_MIN_KG &&
                    cargoWeightKgVolumeL1[0] <= AVERAGE_WEIGHT_MAX_KG &&
                    cargoWeightKgVolumeL1[1] < AVERAGE_VOLUME_MAX
                }"
    )

    println(
        "Груз с весом ${cargoWeightKgVolumeL2[0]} кг и объемом ${cargoWeightKgVolumeL2[1]} л " +
                "соответствует категории 'Average': ${
                    cargoWeightKgVolumeL2[0] > AVERAGE_WEIGHT_MIN_KG &&
                    cargoWeightKgVolumeL2[0] <= AVERAGE_WEIGHT_MAX_KG &&
                    cargoWeightKgVolumeL2[1] < AVERAGE_VOLUME_MAX
                }"
    )
}
