package exception;

public class Exceptionhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int x=10/0;
			System.out.println("hello");
			System.out.println("x"+x);
		}
		catch(ArithmeticException e) 
		{
			System.out.println("divide by zero not possible");
		}
		
		finally
		{
		int z=10/0;
		System.out.println("hello all");	
		}
	}
}