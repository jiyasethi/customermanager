
public class Student1 {
    	
	int id;
	String name;
	Student1(int i, String n) {
	id = i;
	name = n;
	
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1 s1 = new Student1(1 , "n");
		Student1 s2 = new Student1(2 , "n");
		Student1 s3 = new Student1(3 , "n");
		
		s1.displayDetails();
		s3.displayDetails();
		s1.displayIDinformation();

	}
           public void displayDetails() {
             System.out.println(id + " " + name);	
	
}
                public void displayIDinformation() {
    	         System.out.println("I only want id information " + id);  
      }
      }

