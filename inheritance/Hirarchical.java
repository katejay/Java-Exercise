package inheritance;

class animal2 {
	void eat() {
		System.out.println("Eating...");
	}
}

class Dog2 extends animal2{
	void bark() {
		System.out.println("barking...");
	}
}

class Cat2 extends animal2 {
	void meow() {
		System.out.println("Meow...");
	}
}
public class Hirarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat2 c2 = new Cat2();
		c2.meow();
		c2.eat();
		
		Dog2 d2= new Dog2();
		d2.bark();
		d2.eat();
	}

}
