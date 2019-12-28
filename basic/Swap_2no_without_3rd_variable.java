package basic;

public class Swap_2no_without_3rd_variable {
	static int a=10;
	static int b=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 a = a+b;
		 b = a-b;
		System.out.println("new b is : " +b);
		 a = a-b;
		System.out.println("new a is : "+a);
	}

}
