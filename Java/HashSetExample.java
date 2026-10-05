package TNS;
import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<>();
	      hset.add("Asad");
	      hset.add("Ammar");
	      hset.add("Asad");
	      hset.add("Naved");
	      hset.add("Asad");
	      hset.add("Sajid");

	      System.out.println("it will print elements according to the Alphabetical Order and only Unique Values ..");
	      for(String str:hset)
	        System.out.println(str+" ");

	}

}
