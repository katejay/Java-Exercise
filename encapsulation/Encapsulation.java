package encapsulation;
class abc{
	private int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}


public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abc a1 = new abc();
		a1.name="jay";
		a1.setId(2018);
		System.out.println("Name is : "+a1.name+ "    " +  "id is : "+a1.getId());
	}

}
