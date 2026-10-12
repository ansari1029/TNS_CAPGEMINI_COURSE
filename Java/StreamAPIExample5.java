package TNS;

import java.util.*;

class Product5 {
    int id;
    String name;
    float price;

    // Constructor
    public Product5(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class StreamAPIExample5 {

    public static void main(String[] args) {

        List<Product5> productList = new ArrayList<Product5>();

        productList.add(new Product5(1, "HP Laptop", 25000f));
        productList.add(new Product5(2, "Asus Laptop", 35000f));
        productList.add(new Product5(3, "Mac Laptop", 29000f));
        productList.add(new Product5(4, "Lenovo Laptop", 15000f));
        productList.add(new Product5(5, "Dell Laptop", 95000f));

        // Maximum price
        Product5 productA = productList.stream()
                .max((p1, p2) -> Float.compare(p1.price, p2.price))
                .get();

        System.out.println("Max Price of Laptop: " + productA.price);

        // Minimum price
        Product5 productB = productList.stream()
                .min((p1, p2) -> Float.compare(p1.price, p2.price))
                .get();

        System.out.println("Min Price of Laptop: " + productB.price);
    }
}