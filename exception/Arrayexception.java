package exception;

public class Arrayexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]=new int[3];
			a[0]=1;
			a[1]=2;
			a[2]=3;
			a[4]=5;
			System.out.println(a[4]);
			
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		
	}

}
