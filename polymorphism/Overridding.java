package polymorphism;

class animal {
	void eat() {
		System.out.println("Eating..");
	}
}

class dog extends animal {
	void eat() {
		System.out.println("Eating Bread..");
	}
	
	void bark() {
		System.out.println("Barking...");
	}
	
	void weep() {
		super.eat();
		bark();
	}
}


public class Overridding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	dog d=new dog();
	d.weep();
	d.eat();
}
}