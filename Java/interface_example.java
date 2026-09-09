interface printable{
	void print();
}
public class interface_example implements printable{

	public void print() {
		System.out.println("This is Interface!");
	}
	public static void main(String[] args) {
		printable obj=new interface_example();
		obj.print();

	}

}