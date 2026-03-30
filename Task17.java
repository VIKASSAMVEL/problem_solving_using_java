import java.util.*;

class InsufficientStockException extends Exception {
    public InsufficientStockException(String message) {
        super(message);
    }
}

class Order {
    int orderId;
    String productName;
    int quantity;
    int availableStock;

    Order(int orderId, String productName, int quantity, int availableStock) {
        this.orderId = orderId;
        this.productName = productName;
        this.quantity = quantity;
        this.availableStock = availableStock;
    }

    void process() throws InsufficientStockException {
        if (quantity > availableStock) {
            throw new InsufficientStockException("Order " + orderId + " failed: Insufficient stock");
        }
        System.out.println("Order " + orderId + " processed successfully");
    }
}

public class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Order order = new Order(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt());
            try {
                order.process();
            } catch (InsufficientStockException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
