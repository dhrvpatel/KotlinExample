abstract class Car {
    abstract var name: String
    abstract var releaseYear: Int
    abstract var price: Int
}

class Cruze: Car() {
    override var name: String = "Default value"
    override var releaseYear: Int = 0
    override var price: Int = 0

    var extraFeatures: Boolean = false
}

class Sierra: Car() {
    override var name: String = "Default value"
    override var releaseYear: Int = 0
    override var price: Int = 0

    var hasTrailer: Boolean = false
}

class Ats: Car() {
    override var name: String = "Default value"
    override var releaseYear: Int = 0
    override var price: Int = 0

    var color: String = "Default value"
}

fun main() {

    var cruze = Cruze()
    cruze.name = "Cruze xl"
    cruze.releaseYear = 2015
    cruze.price = 25000
    cruze.extraFeatures = true

    var sierra = Sierra()
    sierra.name = "Sierra"
    sierra.releaseYear = 2017
    sierra.price = 36500

    var ats =Ats()
    ats.name = "ATS"
    ats.releaseYear = 2019
    ats.color = "Blue"
    ats.price = 57300

    var list = listOf(cruze,ats,sierra)
    val sortedCarsByPrice = list.sortedBy { Car -> Car.releaseYear }
    sortedCarsByPrice.forEach{ e -> println(e.name + " released in "
            + e.releaseYear + " with the price of $" + e.price
    ) }

}

