package jay;
import java.util.Scanner;
public class RT_palindrom {
	static int num;
	static int remainder;
	static int count=0;
	static int temp=num;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the number : ");
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
			System.out.println("Number is Palindrom");
		}
		else
		{
			System.out.println("number is not Plalindrom");
		}
	}

}