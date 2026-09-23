import java.util.*;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		System.out.println("Lined List Created");
		l.add("Ansari");
		l.add("Asad");
		l.add("Atahr");
		l.add("Usman Gani");
		l.add("Farhan");
		
		System.out.println(l);
		
		l.add(1, "S.K.");
		System.out.println("Added S.K. At index 1 :\n"+l);
		
		LinkedList<String> l2 = new LinkedList<String> ();
		//l2.addAll(l); //will add all elements
		l2.add("Nana");
		l2.add("Dada");
		l2.addAll(1,l); //it will Add all elements from index 1
		l2.addLast("I'm in the Last");
		System.out.println("\nAfter Creating L2\n");
		System.out.println(l2);

	}

}
