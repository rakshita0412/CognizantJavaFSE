package Ex1;
public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product item1 = new Product("001", "Coffee Maker", 30, 89.99);
        Product item2 = new Product("002", "Bluetooth Speaker", 150, 29.99);
        Product item3 = new Product("003", "SmartWatch", 75, 199.99);
        Product item4 = new Product("003", "Laptop", 55, 179.99);

        inventory.addProduct(item1);
        inventory.addProduct(item2);
        inventory.addProduct(item3); 
        inventory.addProduct(item4);


        inventory.updateProduct("003", new Product("003", "SmartWatch", 79, 377.99));

        inventory.deleteProduct("004");

        Product item = inventory.getProduct("001");
        System.out.println("Retrieved: " + item);
    }
}
