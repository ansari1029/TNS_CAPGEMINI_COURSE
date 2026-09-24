package TNS;
import java.util.*;

public class ListExample {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();  //List is interface which is implemented in ArrayList
		
		l.add("Asad");
		l.add("Ansari");
		
		for(String var:l)
			System.out.println(var);
		
		System.out.println("Element At index 1 :"+l.get(1));
		
		System.out.println("After Editing at 1 :");
		l.set(1,  "Khan");
		System.out.println(l);
		
		System.out.println("Size of the List :"+l.size());
		
		System.out.println("After Deleting at index 1 :");
		l.remove(1);
		System.out.println(l);
	}

}
