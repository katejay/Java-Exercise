package accessmodifier;

public class Protected {
	protected int x=10;
	protected int y=20;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Protected p1 = new Protected();
		int z = p1.x+p1.y;
		System.out.println(z);
	}
}