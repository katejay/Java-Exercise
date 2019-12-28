package basic;
import java.util.Scanner;
public class Even_odd {
	static int x;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		x=sc.nextInt();
		
		if ( x % 2 == 0)
		{
			System.out.println(x+ " number is even");
		}
		else
		{
			System.out.println(x+ " number is odd");
		}
			
	}

}
