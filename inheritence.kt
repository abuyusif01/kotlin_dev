// use sealed keyword to make sure its not inherited
// the subclass must be open to be inherited


// open class Vehicle // super, parent, super, base class
// {

// }
// subclass for vehicle
open class Car( val name: String, val brand: String)
{
	open var range: Double = 0.0 // we must make it open to overide in the subclass

	fun extendRange(amount: Double)
	{
		if (amount > 0)
		{
			range += amount
		}
	}

	open fun drive(distance: Double )
	{
		print("A Car can drive for $distance Km\n")
	}
}
// if the super have default constructor then we must include it
// in our declaration --> Electrical(name: String, brand: String)
// without explicit saying var or val and we can have more feautres
// eg Electrical(name: String, brand: String, power: Int)
class Electrical(name: String, brand: String, power: Int) 
: Car(name, brand)
{
	override var range = power * 10.0; // basically overriding 

	override fun drive(distance: Double)
	{
		print("Tesla Can drive upto $distance Km\n")
	}

	fun drive()
	{
		print("The max Speed for tesla is: $range")
	}
}

fun main()
{
	var myCar = Car("A4", "Audi")
	var ElectricalCar = Electrical("XG65", "Tesla", 89)
	myCar.drive(300.0) // will print a car can drive till N
	ElectricalCar.drive(400.0) // will print tesla can drive upto N
	ElectricalCar.drive() // will print the max speed basically

}
