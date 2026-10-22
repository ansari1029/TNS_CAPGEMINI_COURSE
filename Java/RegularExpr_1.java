package TNS;
import java.util.regex.*;

public class RegularExpr_1 {
	    public static void main(String[] args) {
	        Pattern p = Pattern.compile(".s");
	        Matcher m = p.matcher("is");
	        boolean b = m.matches();

	        System.out.println(b);

	        //in one line
	        boolean b2 = Pattern.compile("..ad").matcher("Asad").matches();
	        System.out.println(b2);
	    }
}
