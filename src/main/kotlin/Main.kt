import kotlin.math.max

fun main() {
val car= Car("Limozin","Legacy","nevi blue",13)
    car.carryPeople(17,13)
    car.identity()
 println(car.calculateParkingFees(2))

    val bus = Bus("Benz","kiaEV6","white",5)
bus.carryPeople(5,5)
bus.identity()
    bus.maxTripFare(6.0,5)
}


//Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
//- carry(people: Int) : Prints out “Carrying $people passengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity
//(3 points)
//- identity() : Prints out the color, make and model in the following
//format e.g: “I am a white subaru legacy” (1 point)
//- calculateParkingFees(hours: Int) : Calculates and returns the
//parking fees by multiplying the hours by 20 (1 point)
//



class Car(var make:String,var model:String,var color:String,var capacity:Int){

    fun carryPeople(passengers:Int,capacity: Int){
        var x=passengers-capacity
        if (passengers<=capacity)
            println("Carrying $passengers")
else
            (println("over capacity by $x passengers"))


    }
fun identity(){
println("I am  a $color $make $model")

}
fun calculateParkingFees(hours:Int):Int{
    var modulus=hours*20
    return modulus

}
    }
//2. Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method called maxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//trip. (2 points)
//The bus’ calculateParkingFees method returns the product of hours and
//the capacity of the bus (3 points)
//
//Make use of inheritance to avoid duplication. Also be sure to instantiate both classes
//and call each of the functions on the objects.



class Bus(var make:String,var model:String,var color:String,var capacity:Int){

    fun carryPeople(passengers:Int,capacity: Int){
        var x=passengers-capacity
        if (passengers<=capacity)
            println("Carrying $passengers")
        else
            (println("over capacity by $x passengers"))


    }
    fun identity(){
        println("I am  a $color $make $model")

    }
    fun calculateParkingFees(hours:Int,capacity: Int):Int {
        var fee = hours * capacity

        return fee

    }
    fun maxTripFare(fare:Double,capacity: Int):Double{
        var malta = fare*capacity
        println(malta)
        return malta


    }    }






