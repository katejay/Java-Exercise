package basic;
import java.util.Scanner; 

public class RT_addition {
	static int x;
	static int y;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter 1st Number : ");
		x = sc.nextInt();
		
		System.out.print("Enter 2nd Number : ");
		y = sc.nextInt();
		
		int z;
		z = x+y;
		System.out.println("Addition is : "+z);
	}

}
