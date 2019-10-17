package objectandclass;

public class Methoddata {
int x,y;
int sum(int a,int b) {
	x=a;
	y=b;
	return x+y;
}

void show() {
	System.out.println("x:"+x);
	System.out.println("y:"+y);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methoddata m1=new Methoddata();
		Methoddata m2=new Methoddata();
		
		System.out.println(m1.sum(12,10));
		m1.show();
		m1.show();
		System.out.println(m2.sum(44, 10));
	}

}
