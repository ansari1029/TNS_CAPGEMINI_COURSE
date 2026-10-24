import java.util.regex.*;
import java.util.*;

public class RegularExpr_3 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Pattern");
	        Pattern p = Pattern.compile(sc.nextLine());

	        System.out.println("Enter Text to Match");
	        Matcher m = p.matcher(sc.nextLine());

	        if(m.matches()){
	            System.out.println("Match Found.......");
	        }
	        else{
	            System.out.println("Match not found......");
	        }
	    }
}
