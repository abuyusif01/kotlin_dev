fun main()
{
	var Abubakar = Person("Abubakar", "Yusif", 19)
	var John = Person(Lname = "diggle")
	John.hobby = "Flirting with girls"

	Abubakar.stateHobby()
	Abubakar.age = 20
	print("Abubakar is ${Abubakar.age} years Old")
	John.stateHobby()

}


class Person(Fname: String = "John" , Lname: String= "Matazu")
{
	constructor(Fname: String, Lname: String, age: Int) 
	: this(Fname, Lname) // because we using the main f and lane
	{
		this.age = age;
	}
	var	Fname: String?= null
	var age: Int? = null
	var hobby: String = "Watching Netflix"

	//var Fname: String = Fname
	init // basically like the super key in java
	{
		print("My Fname is: $Fname and Lname: $Lname\n");
		this.Fname = Fname
	}

	/* Method buy they called member functions */
	fun stateHobby()
	{
		print(Fname + " hooby is: $hobby\n")
	}
}