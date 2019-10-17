package objectandclass;

public class Parameteriesconst {
	int id;
	String name;
	
	Parameteriesconst (int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	void display()
	{
		System.out.println("Id is : "+id);
		System.out.println("Name is : "+name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameteriesconst P = new Parameteriesconst(1,"abc");
		P.display();		
	}

}
