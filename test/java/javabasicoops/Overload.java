package javabasicoops;

public class Overload {


	public static void main(String[] args) {
		Overload obj = new Overload();
		obj.add(20,20);
		obj.add(80.9,90.00,70.8);
		obj.add(12.1f,15.8f);		
	}
	
	void add(int x, int y) {
		System.out.println(x+y);
	}
	void add(double a, double b, double c) {
		System.out.println(a+b+c);
	}
	void add(float x, float y) {
		System.out.println(x+y);
	}



}
