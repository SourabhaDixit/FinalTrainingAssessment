package javabasicoops;


abstract class Bike{
	 abstract void run();  // abstract method
	void m2() {//non abstract method
		System.out.println("Non abstarct method M2");
		}
	}

	public class AbstractHonda extends Bike {
		void run(){
			System.out.println("running safely");
			}
		

		public static void main(String[] args) {// main method
			AbstractHonda obj = new AbstractHonda();// creating object
			obj.run();
			obj.m2();

		}

	}
	
	