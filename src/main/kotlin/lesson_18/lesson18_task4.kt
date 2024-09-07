package lesson_18

import kotlin.math.pow

abstract class Parcel {
    abstract fun getParcelSurfaceArea(): Double
}

class RectangularParcel(val length: Double, val width: Double, val height: Double) : Parcel() {
    override fun getParcelSurfaceArea() = (length * width + width * height + length * height) * 2
}

class CubeParcel(private val length: Double) : Parcel() {
    override fun getParcelSurfaceArea() = length.pow(2) * 6
}


fun main() {
    val rectangularParcel = RectangularParcel(4.0, 3.0, 2.0)
    val cubeParcel = CubeParcel(3.0)

    val listOfParcels: List<Parcel> = listOf(rectangularParcel, cubeParcel)
    listOfParcels.forEach {
        println("Площадь поверхности посылки: ${it.getParcelSurfaceArea()}")
    }
}