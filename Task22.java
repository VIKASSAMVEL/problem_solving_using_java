import java.util.*;

public class Task22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            map.put(start, map.getOrDefault(start, 0) + 1);
            map.put(end, map.getOrDefault(end, 0) - 1);
        }
        
        int maxRooms = 0;
        int currentRooms = 0;
        
        for (int count : map.values()) {
            currentRooms += count;
            maxRooms = Math.max(maxRooms, currentRooms);
        }
        
        System.out.println(maxRooms);
        sc.close();
    }
}
