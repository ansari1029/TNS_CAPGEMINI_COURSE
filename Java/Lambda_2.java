package TNS;
import java.util.*;

public class Lambda_2 {
	    public static void main(String[] args) {
	        List<String> l = new ArrayList<>();

	        l.add("Asad");
	        l.add("Sohail");
	        l.add("Iftikhar");
	        l.add("Salman");

	        l.forEach((n)->System.out.println(n));
	    }
}
