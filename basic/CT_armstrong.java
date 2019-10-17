package jay;

public class CT_armstrong {
	static int num =153;
	static int remainder;
	static int count=0;
	static int temp=num;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (num > 0)
		{
			remainder =  num%10;
			num = num/10;
			count = count + remainder * remainder * remainder;			
		}
		if (temp==count)
		{
			System.out.println("Number is arm");
		}
		else
		{
			System.out.println("number is not arm");
		}
	}

}
