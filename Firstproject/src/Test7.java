
public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 18;
		double es = 0.5;
		
		if(age>=16) {
		
		System.out.println("User is eligible to drive");
		 
		 if(es<=0.5) {
	          System.out.println("User is eligible to drive as both check passed ");
		 }
	
		else {
		 System.out.println("User is not eligible to drive because es check failed");
		}
		}
		 else {
		System.out.println("User is not eligible to drive because age check failed");
		 }
	
	
	}

}
