package jay;
import java.util.Scanner;
public class RT_factorial_no {
	static int number;
	static int i;
	static int fact= 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Number : ");
		number = sc.nextInt();
		
		  for(i=1;i<=number;i++)
		  {
			  fact=fact*i;
		  }
		  System.out.println("Factorial is : "+fact);
	}

}
