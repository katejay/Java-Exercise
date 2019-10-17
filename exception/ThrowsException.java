package exception;

import java.io.IOException;

class Method123{  
	 void method()throws IOException{  
	  throw new IOException("device error");  
	 }  
	}  
public class ThrowsException {
	public static void main(String args[]){  
	    try{  
	    	Method123 m=new Method123();  
	     m.method();  
	    }
	    catch(Exception e){
	    	System.out.println("exception handled");
	    	}     
	  
	    System.out.println("normal flow...");  
	  }  
}
