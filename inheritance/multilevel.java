package inheritance;

class animal1 {
	void eating() {
		System.out.println("Eating...");
	}
}

class dog1 extends animal {
	void barking() {
		System.out.println("Barking...");
	}
}

class puppy extends dog1 {
	void weep() {
		System.out.println("Weeping...");
	}
}

public class multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		puppy p1= new puppy();
		p1.weep();
		p1.barking();
		p1.eat();
	}

}
