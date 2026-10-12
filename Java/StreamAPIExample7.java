package TNS;

import java.util.*;
import java.util.stream.Collectors;

class Product7 {
    int id;
    String name;
    float price;

    // Constructor
    public Product7(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class StreamAPIExample7 {

    public static void main(String[] args) {

        List<Product5> productList = new ArrayList<Product5>();

        productList.add(new Product5(1, "HP Laptop", 25000f));
        productList.add(new Product5(2, "Asus Laptop", 35000f));
        productList.add(new Product5(3, "Mac Laptop", 29000f));
        productList.add(new Product5(4, "Lenovo Laptop", 15000f));
        productList.add(new Product5(5, "Dell Laptop", 95000f));


        Map<Integer,String> productMap = productList.stream().collect(Collectors.toMap(p->p.id, p->p.name));
        System.out.println(productMap);
    }
}