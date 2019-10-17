package exception;

public class ThrowExcept {
	//void validate(int age){ 
	static void validate(int age) {
	      if(age<18)
	     {
	      throw new ArithmeticException("not valid"); 
	     }
	     else  {
	      System.out.println("welcome to vote"); 
	     }
	   }  
	   public static void main(String args[]){
		  // ThrowExcept t= new ThrowExcept();
	    // t.validate(33);  
	     validate(3);  
	      System.out.println("rest of the code...");  
	  }  

}
