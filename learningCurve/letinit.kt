fun main()
{
	var MyCar = Car()
	MyCar.myBrand= "null"

	println(MyCar.myBrand)
}

class Car()
{
	lateinit var owner: String 
		init
		{
			this.owner = "kotlin"
		}

	var myBrand: String = "null"
		set(value)
		{
			field = if(value.equals("null")) value
			else throw IllegalArgumentException("The Value must be greather than 0")	
		}	

		get()
		{
			return field.toUpperCase()
		}

	var maxSpeed: Int = 250
		set(value)
		{
			field = if(value > 0) value	
			else throw IllegalArgumentException("The Value must be greather than 0")
		}
		
}