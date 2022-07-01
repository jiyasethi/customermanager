package learning;

public class Animal {
	    
	    int def;
	    private int pri;
	    protected int pro;
	    public int pub;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a = new Animal();
		try {
		        int x = 90;
		                        System.out.println(x/1);
		}catch(Exception e) {
		    System.out.println(e);
		}
		 finally {
		   System.out.println("This is important code which is executes always irrespective of exception");
		
		 }
			
		
  /* Animal a = new Animal();
   try {
	   
	   int x = 90;
	   
	   System.out.println(x/0);
	   String s = null;
	   System.out.println(s.length());
	   
   }catch(ArithmeticException e ) {
	   
	  System.out.println(e); 
   }
 */  
	}

}
