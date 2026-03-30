import java.util.*;

public class Task21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int A = sc.nextInt();
            System.out.println(isColorful(A));
        }
        sc.close();
    }
    
    static int isColorful(int A) {
        String s = String.valueOf(A);
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < s.length(); i++) {
            int prod = 1;
            for (int j = i; j < s.length(); j++) {
                prod *= (s.charAt(j) - '0');
                if (set.contains(prod)) return 0;
                set.add(prod);
            }
        }
        return 1;
    }
}
