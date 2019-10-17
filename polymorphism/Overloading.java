package polymorphism;
class Add {
	int sum (int a, int b)
	{
		return a+b;
	}
	
	int sum (int a, int b, int  c)
	{
		return a+b+c;
	}
	
	double sum (double a, double b)
	{
		return a-b;
	}
	
	float sum (float a, float b)
	{
		return a-b;
	}
}


public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add a=new Add();
		System.out.println(a.sum(2,5));
		System.out.println(a.sum(5, 7, 9));
		System.out.println(a.sum(3.5, 1.2));
		System.out.println(a.sum(31.5f, 21.4f));
	}

}
