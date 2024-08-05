package Ex3;

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("001", "Rakshita", 5100.00),
            new Order("002", "Vennela", 9300.00),
            new Order("003", "Saranya", 1500.00),
            new Order("004", "Prada", 3000.00)
        };

        Sorting sorting = new Sorting();

        // Bubble Sort
        sorting.bubbleSort(orders);
        System.out.println("Orders sorted by Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        // Quick Sort
        sorting.quickSort(orders, 0, orders.length - 1);
        System.out.println("Orders sorted by Quick Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
