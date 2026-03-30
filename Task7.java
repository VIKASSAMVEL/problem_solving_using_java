import java.util.*;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        long[] prefixSum = new long[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sc.nextLong();
            prefixSum[i] = sum;
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print((i == 0 ? " " : " ") + prefixSum[i]);
        }
        System.out.println();
    }
}
