import java.util.*;

abstract class Payment {
    abstract String processPayment(double amount);
}

class CreditCardPayment extends Payment {
    String processPayment(double amount) {
        return String.format("Processed CreditCard payment: Total Amount = %.2f", amount * 1.02);
    }
}

class PayPalPayment extends Payment {
    String processPayment(double amount) {
        return String.format("Processed PayPal payment: Total Amount = %.2f", amount + 1.50);
    }
}

class UPIPayment extends Payment {
    String processPayment(double amount) {
        return String.format("Processed UPI payment: Total Amount = %.2f", amount);
    }
}

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ensure Locale output matches standard double string format if needed, 
        // using US Locale to prevent comma instead of point
        sc.useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double amount = sc.nextDouble();
            Payment p = null;
            if (type.equals("C")) p = new CreditCardPayment();
            else if (type.equals("P")) p = new PayPalPayment();
            else if (type.equals("U")) p = new UPIPayment();
            
            if (p != null) {
                System.out.println(p.processPayment(amount));
            }
        }
    }
}
