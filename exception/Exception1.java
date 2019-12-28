package exception;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			//String name="jay";
			String name=null;
			System.out.println(name.length());
		}
		catch(Exception e) {
			System.out.println(e);
			//e.printStackTrace();
		}
		System.out.println("hello");
	}
}
