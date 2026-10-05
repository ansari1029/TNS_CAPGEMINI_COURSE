package TNS;
import java.util.*;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		 ts.add("A");
	     ts.add("B");
	     ts.add("C");
	     ts.add("D");
	     ts.add("E");
	     ts.add("F");
	     ts.add("G");
	     ts.add("H");
	     ts.add("I");
	        



	      System.out.println(ts);
	      System.out.println("First Element of Tree :"+ts.pollFirst()); //popped
	      System.out.println("Last Element of Tree :"+ts.pollLast()); //popped
	      System.out.println("\nOriginal tree After POP"+ts);
	      System.out.println("Reverse Tree is :"+ts.descendingSet());
	      System.out.println("HeadSet when E is true :"+ts.headSet("E",true));//include E and rreturn from top to D
	      System.out.println("TailSet when E is true :"+ts.tailSet("E",true));//include E and rreturn from E to last
	      System.out.println("SubSet of Tree :"+ts.subSet("C",false, "H", true));
	}

}
