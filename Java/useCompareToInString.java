package TNS;

public class useCompareToInString {

	public static void main(String[] args) {
		String a = "Asad";
		String b = "Asad";
		String c = "Apad";
		String d = "Azyd";
		String e = "Zaid";
		
		System.out.println(a.compareTo(b));
		System.out.println(a.compareTo(c));   //(18) bcs s-a = 18 (a s ke pahle aata hai isi liye +18)
		System.out.println(a.compareTo(d));   //(-7) bcs s-z = -7 (a s ke pahle aata hai isi liye +18)
		System.out.println(a.compareTo(e));   //(-25) z comes after a
	}

}
