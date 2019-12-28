package basic;

public class CT_fibo {
	static int x1=0;
	static int x2=1;
	static int x3;
	static int i;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(x1+ " " +x2);
		for (i=0; i<8; i++)
		{
			x3 = x1 + x2;
			System.out.print(" "+x3);
			
			x1=x2;
			x2=x3;
		}
	}	

}