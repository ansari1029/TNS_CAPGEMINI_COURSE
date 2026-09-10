public class Exception_handling {

	public static void main(String[] args) {
		String str="Asad";
		int n=6;
		String str2=null;
		try {
			try {
				System.out.print(str.charAt(5));
			
			}
			catch(StringIndexOutOfBoundsException e) {
				System.out.println("Index out of Bounds");
			}
			System.out.println(str2.length());
		}
		catch(NullPointerException e2) {
			System.out.println("Null Pointer Exception");
		}
	}
}