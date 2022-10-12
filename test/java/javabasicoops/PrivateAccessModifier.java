package javabasicoops;
	class instagram{
		private int age = 21; //Private variable
		private void close_friends_status() { //Private Method
			System.out.println("This is private method & belongs to Class instagram "
					+ "\n Here user stories' can be viewed only by user's close friends ");
		}
		void public_story() {//This method acts as a default access modifier
			System.out.println("This is not private method & belongs to Class instagram "
					+ "\nHere user stories' can be viewed by anyone");
		}


	}

	public class PrivateAccessModifier {

		public static void main(String[] args) {
			instagram obj =new instagram();
			//System.out.println(obj.x); 						// OUT OF SCOPE AS ITS PRIVATE
			//obj.close_friends_status();						// OUT OF SCOPE AS ITS PRIVATE
			obj.public_story(); 								// WITH IN SCOPE AS ITS NOT PRIVATE

		}
	}
