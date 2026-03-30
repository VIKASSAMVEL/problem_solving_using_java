import java.util.*;

class SalesRecord {
    String category;
    String itemName;
    int amount;
    SalesRecord(String category, String itemName, int amount) {
        this.category = category;
        this.itemName = itemName;
        this.amount = amount;
    }
}

class CategoryStats {
    long totalSales = 0;
    String maxSalesItem = "";
    int maxSalesAmt = -1;
}

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        Map<String, CategoryStats> map = new LinkedHashMap<>();
        
        for (int i = 0; i < n; i++) {
            String cat = sc.next();
            String item = sc.next();
            int amt = sc.nextInt();
            
            map.putIfAbsent(cat, new CategoryStats());
            CategoryStats stats = map.get(cat);
            stats.totalSales += amt;
            if (amt > stats.maxSalesAmt) {
                stats.maxSalesAmt = amt;
                stats.maxSalesItem = item;
            }
        }
        
        for (Map.Entry<String, CategoryStats> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue().totalSales + " " + entry.getValue().maxSalesItem);
        }
    }
}
