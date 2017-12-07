package i_introduction._5_Classes

import com.sun.org.apache.xpath.internal.operations.Bool

fun todoTask5(): Nothing = util.TODO(
        """
        Add the following immutable properties to the class declaration of Car:
        * motor of type String
        * seats of type Int
        * automaticTransmission of type Boolean

        Add a property mileage of type Int with public getter but private setter to Car
        Make task5() return an instance of Car
    """
)

class Car{
    var motor : String = ""
    var seats : Int = 0
    var automaticTransmission : Boolean = false
    var mileage : Int = 0
        private set
}

fun task5(): Car {
    return Car()
}