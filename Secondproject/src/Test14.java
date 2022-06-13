
public class Test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 19;
		char country = 'U';
		if (age>=21) {
		 System.out.println("User age check is true");
		 if (country=='U') {
			 System.out.println("User is eligible to vote as both age check and country check true");
		}
		
		else {
			System.out.print("User is not eligible to vote beacuse country check failed");
		}
		}
		else {
			System.out.println("User is not eligible to vote because age check failed");
			
		}
	
	}

}
