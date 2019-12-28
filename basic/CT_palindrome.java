package basic;

public class CT_palindrome {
	static int num =121;
	static int remainder;
	static int count=0;
	static int temp=num;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
