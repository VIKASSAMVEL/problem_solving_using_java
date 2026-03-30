import java.util.*;
import java.util.stream.*;

class Task23Item {
    String name;
    double rating;

    Task23Item(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }
}

public class Task23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        List<Task23Item> items = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            items.add(new Task23Item(sc.next(), sc.nextDouble()));
        }
        
        List<Task23Item> result = items.stream()
            .filter(item -> item.rating >= 8.0)
            .sorted((a, b) -> {
                if (b.rating != a.rating) {
                    return Double.compare(b.rating, a.rating);
                }
                return a.name.compareTo(b.name);
            })
            .collect(Collectors.toList());
            
        for (Task23Item item : result) {
            System.out.println(item.name + " " + item.rating);
        }
        sc.close();
    }
}
