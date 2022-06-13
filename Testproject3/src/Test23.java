
public class Test23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char grade = 'A';
		switch(grade) {
		case 'A' :
		    System.out.println("Excellant");
		break;
		case 'B':
		    System.out.println("Good");
		break;
		case 'C':
		    System.out.println("Fair");
		break;
		case 'D':
		    System.out.println("Fail");
		break;
		
		default:
		   System.out.println("Invalid grade is given");
		}
		
		System.out.println("This is outside switch block");	
		
	}

}
