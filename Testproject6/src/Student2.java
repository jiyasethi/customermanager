
public class Student2 {
	
	 int id;
	String name;
	int age;
	Student2(int i, String n) {
	id = i;
	name = n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Student2 s2 = new Student2(1 , "n");
		s2.displayDetails();
		
		s2.displayIDinformation();
		
	}

	public void displayDetails() {
	 System.out.println(id + " " + name);	
	}
	public void displayIDinformation() {
	
	  System.out.println("i only want id information " + id);
	}
}
