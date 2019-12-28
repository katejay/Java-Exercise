package basic;
import java.util.Scanner;
public class If_else {
	static int x;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the marks : ");
		x = sc.nextInt();
		
		if (x >= 32)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
