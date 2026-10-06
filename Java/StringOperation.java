package TNS;
import java.util.*;

public class StringOperation {
	
	    public static void main(String[] args) {
	      String str1 = "Aasada";  //using String Literal
	      String str2 = new String("Ansari");  //Using new keyword 
	      String str3 = str1.concat("Ansari");  //Original string can't be changed
	      System.out.println(str3);

	      System.out.println("Character at index 2 in ("+str1+") is :"+str1.charAt(2));

	      System.out.println("Whether ("+str1+") contains 'a' or not :"+str1.contains("a"));

	      System.out.println("Whether ("+str1+") Ends with 'a' or not :"+str1.endsWith("a"));

	      System.out.println("On Which Index of ("+str2+") contains 'ari' :"+str2.indexOf("ari"));

	      System.out.println("Whether ("+str2+") is empty or not :"+str2.isEmpty());

	      System.out.println("Last Index of 'a' in ("+str1+") is :"+str1.lastIndexOf('a'));

	      System.out.println("Length of ("+str1+") is :"+str1.length());

	      System.out.println("Replacement in ("+str1+") a->A :"+str1.replace('a','A'));

	      System.out.println("("+str2+") is starts with 'A'? :"+str1.startsWith("A"));

	      String newStr=String.join(".", "Ansari", "Mohanmmad", "Asad");  //each element will separate by first char
	      System.out.println("Use of String.join :("+newStr+")");

	      System.out.println("Use of toUpperCase on ("+str1+") -> "+str1.toUpperCase());

	      System.out.println("Use of toLowerCase on ("+str1+") -> "+str1.toLowerCase());

	      System.out.println("Use of subString on ("+str1+") from 2 :"+str1.substring(2));

	      System.out.println("Use of subString on ("+str1+") from 2-4 :"+str1.substring(2,4));//will not include last index character

	      System.out.println("Check whether "+str1+" & "+str2+" equals by value or not :"+str1.equals(str2)); //didn't check memory location like (==)

	      System.out.println("Check whether "+str1+" & "+str2+" equals by ignoring case :"+str1.equalsIgnoreCase(str2));

	    }

}
