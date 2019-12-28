package exception;

public class Exceptionwithstacktrace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String s1=null;
		System.out.println(s1.length());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}