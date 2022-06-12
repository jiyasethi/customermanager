
public class Test32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test32 t = new Test32();
		
		//sumOfTwoNums();
		//sumOfTwoNums1(67 , 89);
		int valueFromm = sumOfTwoNums2(80 ,90);	
		System.out.println("Addition is " + valueFromm);
		
	}
	
	   //A method with no return type and no args/aparameters
	
	public static void sumOfTwoNums() {
	
	     int a = 12;
	     int b = 13;
	     int c = a+b;
	     System.out.println(c);
	}
	                //A method with no return type and have args/parameters
      public static void sumOfTwoNums1(int a,int b) {
	  int c = a+b;
	  System.out.println(c);
	
      }
	                    //A method with  return type and have args/parameters

      public static int sumOfTwoNums2(int a, int b) {
      
    	  int c = a+b;
    	  //System.out.println(c);
          return c;
      
      }
                     //A method with return type and no args/parameters
      
     public static int sumOfTwoNums3() {
     int a = 10;
     int b = 12;
      int c = a+b;
     return c;
      }
      
}		







