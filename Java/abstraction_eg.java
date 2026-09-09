abstract class Animal{
abstract void sound();
void eat() {
	System.out.println("Hello from non abstract method");
}
}
class dog extends Animal{
        @Override
	void sound() {
		System.out.println("Dog Barks");
	}
}
class cat extends Animal{
        @Override
	void sound() {
		System.out.println("Cat not Barks");
	}
}
public class abstraction_eg {

	public static void main(String[] args) {
		System.out.println("Abstract Class Example!!");
		Animal obj1=new dog();
		Animal obj2=new cat();
		
		obj1.sound();
		obj2.sound();
        obj1.eat();

	}

}
