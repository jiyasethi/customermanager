
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		char age = 25;
		
		if(age>21) {
		   System.out.println("User is eligible to drive");
		}
		else {
		  System.out.println("User is not eligible to drive");
		}
		*/
		int x = 25;
		int y = 20;
		
		boolean v1 = (x<=y);
		boolean v2 = (x>=y);
		System.out.println(v1&&v2);
		
		/*v1 and v2 is true thats why we use (||) if both conditions are false then its false if 1 is false and 1 is true it will show true */
		
		System.out.println(!v1||v2);
		
		
		
	}

}
