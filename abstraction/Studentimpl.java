package abstraction;

public class Studentimpl implements Studentinterface {

	public void show()
	{
		System.out.println("Welcome");
	}
	
	public int sum(int a, int b)
	{
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentinterface s1= new Studentimpl();
		s1.show();
		System.out.println(s1.sum(3,5));
	}

}
