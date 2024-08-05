package Ex1;

import java.util.HashMap;

public class Inventory {
    private HashMap<String, Product> products;

    public Inventory() {
        this.products = new HashMap<>();
    }

    public void addProduct(Product item) {
        products.put(item.getProductId(), item);
        System.out.println("Added: " + item);
    }

    public void updateProduct(String productId, Product newItem) {
        if (products.containsKey(productId)) {
            products.put(productId, newItem);
            System.out.println("Updated: " + newItem);
        } else {
            System.out.println("Product ID " + productId + " not found.");
        }
    }

    public void deleteProduct(String productId) {
        Product removedItem = products.remove(productId);
        if (removedItem != null) {
            System.out.println("Deleted: " + removedItem);
        } else {
            System.out.println("Product ID " + productId + " not found.");
        }
    }

    public Product getProduct(String productId) {
        return products.get(productId);
    }
}
