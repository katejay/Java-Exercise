package jay;

public class Swap_3no_without_4th_variable {
	static int a=10;
	static int b=20;
	static int c=30;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a=a+b;
		System.out.println("new a is : "+a);
		b=c-b;
		System.out.println("new b is : "+b);
		c=a-b;
		System.out.println("new c is : "+c);
	}

}
