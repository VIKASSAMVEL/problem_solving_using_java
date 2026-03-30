import java.util.*;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLine()) return;
        String line = sc.nextLine();
        
        String[] numsStr = line.replaceAll("[^0-9,-]", "").split(",");
        List<Integer> list = new ArrayList<>();
        for (String s : numsStr) {
            if (!s.isEmpty()) list.add(Integer.parseInt(s));
        }
        
        int[] nums = list.stream().mapToInt(i->i).toArray();
        int k = removeDuplicates(nums);
        
        System.out.print(k + ", nums = [");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + (i < k - 1 ? "," : ""));
        }
        System.out.println("]");
    }
    
    static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}
