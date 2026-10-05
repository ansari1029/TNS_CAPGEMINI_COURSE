package TNS;
import java.util.*;

public class DeQueExample {

	public static void main(String[] args) {
		Deque<String> dq = new ArrayDeque<>();  //Deque is an interface so we need ArrayDeque class to use
		dq.add("Ammar Janeman");
	      dq.offer("Asad");
	      dq.add("Naved Pachi");
	      dq.add("Hammad Gaddar");
	      dq.add("Bilal");

	      for(String cnt:dq){
	        System.out.println(cnt+" ");
	      }
	      System.out.println();

	      System.out.println("After Removing. using remove function");
	      dq.remove();
	      for(String cnt:dq){
	        System.out.println(cnt+" ");
	      }
	      System.out.println();

	      System.out.println("After Removing using poll");
	      dq.poll();
	      //dq.pollLast(); //it will last element
	      for(String cnt:dq){
	        System.out.println(cnt+" ");
	      }

	}

}
