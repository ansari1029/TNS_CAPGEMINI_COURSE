package TNS;
import java.util.*;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<>();
	      pq.add("Ammar Janeman");
	      pq.add("Naved Pachi");
	      pq.add("Hammad Gaddar");
	      pq.add("Indra");

	      for(String cnt:pq){
	        System.out.println(cnt+" ");
	      }
	      System.out.println();

	      System.out.println("After Removing using remove() function");
	      pq.remove();
	      for(String cnt:pq){
	        System.out.println(cnt+" ");
	      }
	      System.out.println();

	      System.out.println("After Removing using poll() function");
	      pq.poll();  //it removes by alphabetical order of (a-z) not by input
	      for(String cnt:pq){
	        System.out.println(cnt+" ");
	      }
	}

}
