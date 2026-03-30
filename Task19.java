import java.util.*;
import java.util.regex.*;

public class Task19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLine()) return;
        String line = sc.nextLine();
        
        int kIndex = line.lastIndexOf("k");
        String kPart = line.substring(kIndex);
        int k = Integer.parseInt(kPart.replaceAll("[^0-9-]", ""));
        
        String numsPart = line.substring(0, kIndex);
        String[] numsStr = numsPart.replaceAll("[^0-9,-]", "").split(",");
        List<Integer> list = new ArrayList<>();
        for (String s : numsStr) {
            if (!s.isEmpty()) list.add(Integer.parseInt(s));
        }
        
        int[] nums = list.stream().mapToInt(i->i).toArray();
        int[] res = topKFrequent(nums, k);
        
        System.out.print("[");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + (i < res.length - 1 ? "," : ""));
        }
        System.out.println("]");
    }
    
    static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        for (int key : map.keySet()) {
            pq.add(key);
            if (pq.size() > k) pq.poll();
        }
        
        List<Integer> listRes = new ArrayList<>();
        while (!pq.isEmpty()) listRes.add(pq.poll());
        Collections.reverse(listRes);
        
        int[] res = new int[listRes.size()];
        for (int i = 0; i < listRes.size(); i++) res[i] = listRes.get(i);
        return res;
    }
}
