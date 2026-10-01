package TNS;
import java.util.*;

public class stack_example {

	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<>();
		stk.push(1);
		stk.push(2);
		stk.push(3);
		stk.push(4);
		
		System.out.println(stk);
		stk.pop();
		
		System.out.println("Stack after pop() method "+stk);
		
		int top_ele = stk.peek();
		System.out.println("top Element of stack :"+top_ele);
		System.out.println("Is Stack Empty :"+stk.isEmpty());

	}

}
