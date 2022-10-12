package javabasicoops;
public class ProtectedAccessModifier {

		public static void main(String[] args) {
			ProtectedAccessModifier obj = new ProtectedAccessModifier();
			int sum = obj.add(50,50);
			System.out.println("Sum of 2 numbers is "+ sum);

		}
		protected int add(int x ,int y) {
			int c = x+y;
			return c;
		}
	
}
