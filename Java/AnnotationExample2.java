package TNS;
import java.util.*;

public class AnnotationExample2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		//We just create ArrayList without any datatype so it will give warning
		ArrayList list = new ArrayList();
		
		list.add("Asad");
		list.add("Ammar");
		list.add("Mariyam");
		list.add("Athar");
		list.add("Naved");

		for(Object obj:list) {
			System.out.println(obj);
		}
	}

}
