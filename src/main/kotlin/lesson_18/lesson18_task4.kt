package lesson_18

import kotlin.math.pow

interface Parcel {
    fun getParcelSurfaceArea()
}

class RectangularParcel(val length: Double, val width: Double, val height: Double) : Parcel {
    override fun getParcelSurfaceArea() {
        val area = (length * width + width * height + length * height) * 2
        println("Площадь прямоугольной посылки = $area")
    }
}

class CubeParcel (private val length: Double) : Parcel {
    override fun getParcelSurfaceArea() {
        val area = length.pow(2) * 6
        println("Площадь квадратной посылки = $area")
    }
}

fun main() {
    val rectangularParcel = RectangularParcel(4.0, 3.0, 2.0)
    val cubeParcel = CubeParcel(3.0)

    val listOfParcels : List<Parcel> = listOf(rectangularParcel, cubeParcel)
    listOfParcels.forEach {
        it.getParcelSurfaceArea()
    }
}