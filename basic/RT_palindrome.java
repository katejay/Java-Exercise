package basic;
import java.util.Scanner;
public class RT_palindrome {
	static int num;
	static int remainder;
	static int count=0;
	static int temp=num;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter the number : ");
		num=sc.nextInt();
		temp=num;
		
		while (num > 0)
		{
			remainder =  num%10;
			num = num/10;
			count = count *10 + remainder;			
		}
		if (temp==count)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is not Palindrome");
		}
	}

}
