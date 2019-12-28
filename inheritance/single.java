package inheritance;

class animal {
	void eat() {
		System.out.println("eating.....");
	}
}

class dog extends animal{
	void bark() {
		System.out.println("Barking....");
	}
}

public class Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog d1 = new dog();
		d1.bark();
		d1.eat();
	}

}
