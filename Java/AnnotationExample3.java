package TNS;

class A{
	void n() {
		System.out.println("This is n() method");
	}
	@Deprecated
	void m() {
		System.out.println("This is m() method");
	}
}

public class AnnotationExample3 {

	public static void main(String[] args) {
		A obj = new A();
		obj.n();
	}

}
