
abstract class Car{

    abstract fun display()
}

open class Model(var name: String, var releaseYear : Int, var price: Int) : Car(){

    var horsePower : Int = 0
    var hasCamera: Boolean = false
    var hasTrailer: Boolean = false
    //var price: Int = 0

    override fun display() {
        println("$name released in $releaseYear"+"\n"
                +"It has $horsePower Horsepower "+"\n"
                +"price is "+'$'+ "$price")
    }
}

fun main() {

    var cruze = Model("Chevy Cruze",2019,25000)
    cruze.hasCamera = true
    cruze.horsePower = 150

    var cts = Model("cadillac cts",2018, 53000)
    cts.hasCamera = true
    cts.horsePower = 200

    var sierra = Model("gmc sierra", 2015, 49000)
    sierra.horsePower = 285
    sierra.hasTrailer =true


    println("***************")

    var list = listOf(cruze,cts,sierra)

    val sortedCarsByPrice = list.sortedBy { Car -> Car.releaseYear }
    sortedCarsByPrice.forEach{ e -> println(e.name + " released in "
            + e.releaseYear + " with the price of $" + e.price
    ) }
}
