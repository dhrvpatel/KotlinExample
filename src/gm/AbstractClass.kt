abstract class Car(name:String, price:Int, releaseYear: Int){

    val name: String = name
    val price: Int = price
    val releaseYear: Int = releaseYear
}

class Cruze(
    name: String = "Cruze",
    price: Int = 25000,
    releaseYear: Int = 2018) : Car(name,price,releaseYear) { var hasCamera: Boolean = false }

class Ats(
    name: String = "Ats",
    price: Int = 53000,
    releaseYear: Int = 2016) : Car(name,price,releaseYear) { var color: String = "" }

class Sierra(
    name: String = "Sieraa",
    price: Int = 39000,
    releaseYear: Int = 2019) : Car(name,price,releaseYear) { var hasTrailer: Boolean = false }

fun main() {

    val cruze = Cruze()
    cruze.hasCamera = true

    val ats = Ats()
    ats.color = " Blue"

    val sierra = Sierra()
    sierra.hasTrailer = true

    var list = listOf(cruze,ats,sierra)
    val sortedCarsByPrice = list.sortedBy { Car -> Car.releaseYear }
    sortedCarsByPrice.forEach{ e -> println(e.name + " released in "
            + e.releaseYear + " with the price of $" + e.price
    ) }

}





/// Using Interface
/*
interface Car {

    val name: String
    val releaseDate: Int
    val price: Int

}

class Cruze : Car {

    override val name: String
        get() = "Chevrolet Cruze"
    override val releaseDate: Int
        get() = 32
    override val price: Int
        get() = 25000
}

fun main() {
    val obj = Cruze()

    println("test = ${obj.name}")

}*/
