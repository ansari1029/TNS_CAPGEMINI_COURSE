//@Override
package TNS;

class Animal{
	void met1() {
		System.out.println("Animal is Eating");
	}
}
class Dog extends Animal{
	@Override
	void met1() {
		System.out.println("Dog is Eating");
	}
}

public class AnnotationExample1 {
	public static void main(String[] args) {
		
		Animal obj = new Dog();
		obj.met1();

	}

}
