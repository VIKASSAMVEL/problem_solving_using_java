import java.util.*;
import java.util.stream.*;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        int secondHighest = list.stream()
                .distinct()                       // remove duplicates
                .sorted(Comparator.reverseOrder()) // sort descending
                .skip(1)                            // skip highest
                .findFirst()                        // get second highest
                .orElse(-1);                        // if not present

        System.out.println(secondHighest);
    }
}