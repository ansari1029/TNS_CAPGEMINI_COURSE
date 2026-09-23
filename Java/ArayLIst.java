package TNS;
import java.util.*;

public class ArayLIst {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Mango");
		list.add("Bnana");
		list.add("Graps");
		list.add("WaterMelon");
		
		//Method 1
		//System.out.println(list); //To print values like array
		
		//Method 2
//		Iterator itr=list.iterator(); //iterator is an interface
//		while(itr.hasNext())
//			System.out.println(itr.next());

		//Method 3 using foreach loop
		for(String fruit:list)
			System.out.println(fruit);
	}

}
