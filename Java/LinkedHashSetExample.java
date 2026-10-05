package TNS;
import java.util.*;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		LinkedHashSet<String> lhset = new LinkedHashSet<>();
	      lhset.add("Asad");
	      lhset.add("Ammar");
	      lhset.add("Asad");
	      lhset.add("Naved");
	      lhset.add("Asad");
	      lhset.add("Sajid");

	      System.out.println("it will print elements according to the Order you entered elements and only Unique Values ..");
	      for(String str:lhset)
	        System.out.println(str+" ");	}

}
