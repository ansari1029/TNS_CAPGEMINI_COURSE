package TNS;
import java.util.*;

public class useOfInternKeywordInString {

	public static void main(String[] args) {
		String a = "Asad";
		String b = "Asad";
		String c = new String("Asad");
		String d = c.intern();  //intern() method is used to manually create in (Constant String Pool) CSP
		//when the string is type of heap mem then alo it place it in (CSP).
		
		System.out.println(a==b);
		System.out.println(c==d);
		System.out.println(a==d);

	}

}
