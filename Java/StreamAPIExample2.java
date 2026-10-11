package TNS;
import java.util.*;
import java.util.stream.Collectors;

class Product2{
		int id;
		String name;
		float price;
		
		//constructor
		public Product2(int id, String name, float price) {
			this.id=id;
			this.name=name;
			this.price=price;
		}
}

public class StreamAPIExample2 {	
	public static void main(String[] args) {
		//passing class in the list interface
		List<Product1> productList = new ArrayList<Product1>();
		
		productList.add(new Product1(1, "HP Laptop", 25000f));
		productList.add(new Product1(2, "Asus Laptop", 35000f));
		productList.add(new Product1(3, "Mac Laptop", 29000f));
		productList.add(new Product1(4, "Lenovo Laptop", 15000f));
		productList.add(new Product1(5, "Dell Laptop", 95000f));
		
		//printing elements
		List<Float> productPriceList2 = productList.stream().filter(p->p.price > 30000).map(p->p.price).collect(Collectors.toList());
		System.out.println(productPriceList2);
		

	}

}
