import java.util.*;

// Mocking JUnit components natively for plain compilation without Maven
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Test25 {}

class Assertions25 {
    public static void assertEquals(int expected, int actual) {
        if (expected != actual) throw new AssertionError("Expected " + expected + " but got " + actual);
    }
    public static void assertArrayEquals(int[] expected, int[] actual) {
        if (!Arrays.equals(expected, actual)) throw new AssertionError("Arrays not equal");
    }
    public static void assertTrue(boolean condition) {
        if (!condition) throw new AssertionError("Expected true");
    }
}

class MathUtils {
    public static int maxSubArraySum(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        int max = arr[0], curr = arr[0];
        for (int i = 1; i < arr.length; i++) {
            curr = Math.max(arr[i], curr + arr[i]);
            max = Math.max(max, curr);
        }
        return max;
    }
    
    public static int[] prefixSums(int[] arr) {
        if (arr == null || arr.length == 0) return new int[0];
        int[] res = new int[arr.length];
        res[0] = arr[0];
        for (int i = 1; i < arr.length; i++) res[i] = res[i - 1] + arr[i];
        return res;
    }
    
    public static Map<Integer, Integer> freqCount(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        if (arr == null) return map;
        for (int n : arr) map.put(n, map.getOrDefault(n, 0) + 1);
        return map;
    }
}

public class Task25 {
    @Test25
    public void testEmptyArrays() {
        Assertions25.assertEquals(0, MathUtils.maxSubArraySum(new int[]{}));
        Assertions25.assertArrayEquals(new int[]{}, MathUtils.prefixSums(new int[]{}));
        Assertions25.assertTrue(MathUtils.freqCount(new int[]{}).isEmpty());
    }

    @Test25
    public void testNegativePositive() {
        Assertions25.assertEquals(6, MathUtils.maxSubArraySum(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        Assertions25.assertArrayEquals(new int[]{1, -1, 2}, MathUtils.prefixSums(new int[]{1, -2, 3}));
        Map<Integer, Integer> freq = MathUtils.freqCount(new int[]{1, 1, -2});
        Assertions25.assertEquals(2, freq.get(1));
        Assertions25.assertEquals(1, freq.get(-2));
    }

    @Test25
    public void testLargeArrays() {
        int[] arr = new int[1000000];
        Arrays.fill(arr, 1);
        Assertions25.assertEquals(1000000, MathUtils.maxSubArraySum(arr));
        int[] prefix = MathUtils.prefixSums(arr);
        Assertions25.assertEquals(1000000, prefix[prefix.length - 1]);
        Assertions25.assertEquals(1000000, MathUtils.freqCount(arr).get(1));
    }
    
    public static void main(String[] args) {
        Task25 t = new Task25();
        t.testEmptyArrays();
        t.testNegativePositive();
        t.testLargeArrays();
        System.out.println("All MathUtils tests passed successfully.");
    }
}
