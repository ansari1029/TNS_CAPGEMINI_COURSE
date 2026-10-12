package TNS;

import java.util.*;

class Product6 {
    int id;
    String name;
    float price;

    // Constructor
    public Product6(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class StreamAPIExample6 {

    public static void main(String[] args) {

        List<Product5> productList = new ArrayList<Product5>();

        productList.add(new Product5(1, "HP Laptop", 25000f));
        productList.add(new Product5(2, "Asus Laptop", 35000f));
        productList.add(new Product5(3, "Mac Laptop", 29000f));
        productList.add(new Product5(4, "Lenovo Laptop", 15000f));
        productList.add(new Product5(5, "Dell Laptop", 95000f));

        long count = productList.stream().filter(product ->product.price<900000).count();
        System.out.println("Count of Laptop: " + count);
    }
}