package gm

//Consider General Motors as example, manufactures and releases different car models.
// Write a program to list out different model cars created with the model name, release year and
// its feature properties such as Horsepower, Trailer, rare vision camera, etc.
// Also, list can be sorted either in - release year, price and its model name.


fun main() {


    //Creating List of Cars
    val car = listOf(Car("Cadillac", 2017, "ATS",65000,350,false),
            Car("GMC", 2019, "Truck",45000,650,true),
            Car("Chevrolet", 2014, "Cruze",26000,250,false)
            )


    //Sort by price
    println("*****Sorted by Price*******")
    val sortedCarsByPrice = car.sortedBy { Car -> Car.price }
    sortedCarsByPrice.forEach{ e -> println(e.brandName+ " " + e.model + " " +'$'+e.price) }


    //Sort by Release Year
    println("*****Sorted by Release year*******")
    val sortedCarsByReleaseYear = car.sortedBy { Car -> Car.releaseYear }
    sortedCarsByReleaseYear.forEach{ e -> println(e.brandName+ " " + e.model + " " +'$'+e.price + " " + e.releaseYear) }

}