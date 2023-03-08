fun main(args: Array<String>) {
    var toyota=Car("Toyota","Nissan","Blue",14)
    toyota.carry(20)
    toyota.identity()
    println(toyota.calculateParkingFees(8))
    var noah=Bus("noah","bus","blue",54)
    println(noah.maxTripFare(100.0))
    println(noah.calculateParkingFees(3))
}


//Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
//- carry(people: Int) : Prints out “Carrying $people passengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity
open class Car(var make:String,var model:String,var color:String,var capacity:Int) {
    fun carry(people: Int) {
        var x = people - capacity
        if (people <= capacity) {
            println("Carrying $people passengers")
        } else {
            println("Over capacity by $x people")
        }
    }

//    identity() : Prints out the color, make and model in the following
//    format e.g: “I am a white subaru legacy”

    fun identity() {
        println("I am a $color $make $model ")
    }

    //calculateParkingFees(hours: Int) : Calculates and returns the
//parking fees by multiplying the hours by 20
    open fun calculateParkingFees(hours: Int): Int {
        var product = hours * 20
        return product

    }
}

//    Create a class Bus with the same attributes and functions as the Car class.
//    In addition, it has another method called maxTripFare(fare: Double) that
//    calculates and returns the maximum amount of fare that can be collected per
//    trip. (2 points)
//    The bus’ calculateParkingFees method returns the product of hours and
//    the capacity of the bus (3 points)

    class Bus(make: String,model: String,color: String,capacity: Int,):Car(make,model,color,capacity,) {
        fun maxTripFare(fare:Double):Double{
            var total=fare*capacity
            return total
        }

        override fun calculateParkingFees(hours: Int): Int {
//            return super.calculateParkingFees(hours)
            var x=hours *capacity
            return x

        }


    }





