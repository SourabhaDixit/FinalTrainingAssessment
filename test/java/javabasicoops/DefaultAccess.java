package javabasicoops;
class Default{
	 int x=280; //Default variable
	 void m1() { //Default Method
		System.out.println("This is Default method & belongs to Class B");
	}
}

public class DefaultAccess {

	public static void main(String[] args) {
		Default obj = new Default();
		System.out.println(obj.x); 
		obj.m1();
		

	}

}
