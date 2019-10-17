package jay;
import java.util.Scanner;
public class RT_fibo {
	static int x1;
	static int x2;
	static int x3;
	static int i;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the first number");
		x1=sc.nextInt();
		System.out.println("Enter the second number");
		x2=sc.nextInt();
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
