package basic;
import java.util.Scanner;
public class Else_if {
	static int x;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the marks : ");
		x = sc.nextInt();
		
		if (x>90)
		{
			System.out.println("A+");
		}
		
		else if (x>80 && x<90)
		{
			System.out.println("A");
		}


		else if (x>70 && x<80)
		{
			System.out.println("B+");
		}
		

		else if (x>60 && x<70)
		{
			System.out.println("B");
		}
	
		else if (x>50 && x<60)
		{
			System.out.println("C+");
		}
		
		else if (x>40 && x<50)
		{
			System.out.println("C");
		}
		
		else if (x>0 && x<40)
		{
			System.out.println("D");
		}
	
		else
		{
			System.out.println("Invalid number");
		}
	}
	

}
