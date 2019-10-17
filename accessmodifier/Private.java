package accessmodifier;

class Private {
private int id;
private String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Private p1 = new Private();
		p1.id=2018;
		p1.name="Jay";
		System.out.println("Name : "+p1.name+"  "+"id : "+p1.id);

		//deafult program for testing purpose
		Default d1=new Default();
		//d1.p=100;
		//d1.q=300;
		int s = d1.p+d1.q;
		System.out.println(s);
	
	}

}
