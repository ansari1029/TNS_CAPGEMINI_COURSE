package TNS;
import java.util.*;

interface calc{
    int add(int a,int b);
    
}

public class Lambda_1 {
	    public static void main(String[] args) {
	        calc c=(a,b)->{
	            return a+b;
	        };
	        System.out.println("Ans is "+c.add(2,3));
	    }
}
