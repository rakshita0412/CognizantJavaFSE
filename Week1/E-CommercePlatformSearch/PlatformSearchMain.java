package Ex2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("001", "Coffee Maker", "Electronics"),
            new Product("002", "Bluetooth Speaker", "Electronics"),
            new Product("003", "SmartWatch", "Electronics"),
            new Product("004", "Laptop", "Electronics"),
            new Product("005", "Earphones", "Accessories")
        };

        Search search = new Search();

        Product foundProduct = search.linearSearch(products, "002");
        System.out.println("Linear Search: Found " + foundProduct);

        Arrays.sort(products, (item1, item2) -> item1.getProductId().compareTo(item2.getProductId()));

        foundProduct = search.binarySearch(products, "002");
        System.out.println("Binary Search: Found " + foundProduct);
    }
}
