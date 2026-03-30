import java.util.*;

public class Task8 {
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
        int[] res = maxSlidingWindow(nums, k);
        
        System.out.print("[");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + (i < res.length - 1 ? "," : ""));
        }
        System.out.println("]");
    }
    
    static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) return new int[0];
        int n = nums.length;
        int[] result = new int[n - k + 1];
        int ri = 0;
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            while (!q.isEmpty() && q.peek() < i - k + 1) q.poll();
            while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) q.pollLast();
            q.offer(i);
            if (i >= k - 1) result[ri++] = nums[q.peek()];
        }
        return result;
    }
}
