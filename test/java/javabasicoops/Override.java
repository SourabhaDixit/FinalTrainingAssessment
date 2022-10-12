package javabasicoops;


	class Friend {
		void friendship() {
			System.out.println("My college friends are in same company.");
		}
	}
	public class Override extends Friend {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Override obj = new Override();
			obj.friendship();

		}
		void friendship() {
			super.friendship();
			System.out.println("My college friends are also in testing team");
		}

	

}
