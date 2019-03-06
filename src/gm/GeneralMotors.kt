package gm

abstract class GeneralMotors(val brandName: String,
                             val releaseYear: Int){

    // Abstract Property (Must be overridden by Subclasses)
    abstract var model: String
    abstract var price: Int
    abstract var horsePower: Int
    abstract var trailer: Boolean

    /*fun displayDetails() {
        println("Name: $brandName, Model: $model, Release year: $releaseYear, Price: $price, Horse Power: $horsePower, Trailer: $trailer")
    }*/
}

class Car(brandName: String,
          releaseYear: Int,
          override var model: String,
          override var price: Int,
          override var horsePower: Int,
          override var trailer: Boolean) : GeneralMotors(brandName,releaseYear)
