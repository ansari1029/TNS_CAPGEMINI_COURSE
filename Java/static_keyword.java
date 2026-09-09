public class static_keyword {

	//static variable
	static String clg = "VPPCOE";
	float marks;
	
	//constructor
	static_keyword(float per){
		marks = per;
		System.out.println("Static variable: "+clg+" & "+marks);
	}
	
	//static method
	static int add(int a, int b) {
		return a+b;
	}
	
	//static block
	static {
		System.out.println("This is Static Block and will be printed first");
	}
	
	public static void main(String[] args) {
		static_keyword bj = new static_keyword(95.20f);
		System.out.println(static_keyword.clg);
		System.out.println("Addition of static method is "+static_keyword.add(5, 10));
		
	}
}