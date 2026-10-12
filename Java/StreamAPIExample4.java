package TNS;
import java.util.*;
import java.util.stream.Collectors;

class Product4{
		int id;
		String name;
		float price;
		
		//constructor
		public Product4(int id, String name, float price) {
			this.id=id;
			this.name=name;
			this.price=price;
		}
}

public class StreamAPIExample4 {	
	public static void main(String[] args) {
		//passing class in the list interface
		List<Product1> productList = new ArrayList<Product1>();
		
		productList.add(new Product1(1, "HP Laptop", 25000f));
		productList.add(new Product1(2, "Asus Laptop", 35000f));
		productList.add(new Product1(3, "Mac Laptop", 29000f));
		productList.add(new Product1(4, "Lenovo Laptop", 15000f));
		productList.add(new Product1(5, "Dell Laptop", 95000f));
		
		//printing elements
		double totalPrice = productList.stream().collect(Collectors.summingDouble(product->product.price));
		System.out.println("Total Price of every Laptop :"+totalPrice);
		

	}

}
