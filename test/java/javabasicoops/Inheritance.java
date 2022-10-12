package javabasicoops;

public class Inheritance {

	public static void main(String[] args) {
		Benificiary a = new Benificiary();
		//Single inheritance
		a.user();
		a.addBeni();
		System.out.println("***********************");
		//Multilevel inheritance
		
		TransferFunds user = new TransferFunds();
		user.user();
		user.addBeni();
		user.transfer();
	}
}

class Login{
	void user(){
		System.out.println("User has login");
	}
}
class Benificiary extends Login{
	void addBeni() {
		System.out.println("Benificiary added");
	}
}
class TransferFunds extends Benificiary{
	void transfer() {
		System.out.println("Amount has been transferred to Benificiary");
	}
}
