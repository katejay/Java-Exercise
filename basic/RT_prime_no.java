package jay;
import java.util.Scanner;
public class RT_prime_no {
	static int x;
	static int i;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number : ");
		x = sc.nextInt();
	
		for(i = 2; i <= x/2; ++i)
        {
 
            if (x % i == 0)
            {
            	System.out.println( x+ " is not a prime number.");
            }
            	
            else
            {
            	System.out.println( x+ " is a prime number."); 
            }
        }
	}
}
