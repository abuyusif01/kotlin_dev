data class User(val id: Long = 101, var name: String = "Genesis") // we must add atleas one argument 
{ 
	// init
	// {
	// 	print("UserClass Created with id: $id \n");
	// }
}

fun main()
{
	val user =  User(1, "Abubakar")
	var user1 = User(name = "Yusif")
	println(user1)
	val updateUser = user1.copy(name = "Modafuka")
	print(user.component1()) //basically this function returns the params in order

	// var user1 = User().copy(name = "3")
}

