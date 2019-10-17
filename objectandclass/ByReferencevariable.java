package objectandclass;

public class ByReferencevariable {
int x;
int y;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByReferencevariable r1=new ByReferencevariable();
		r1.x=10;
		r1.y=20;
		int z=r1.x+r1.y;
		System.out.println(z);
	}

}
