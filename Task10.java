import java.util.*;
import java.util.regex.*;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLine()) return;
        String line = sc.nextLine();
        
        String text = "";
        String pattern = "";
        
        Matcher m1 = Pattern.compile("text\\s*=\\s*\"([^\"]+)\"").matcher(line);
        if (m1.find()) text = m1.group(1);
        
        Matcher m2 = Pattern.compile("pattern\\s*=\\s*\"([^\"]+)\"").matcher(line);
        if (m2.find()) pattern = m2.group(1);
        
        System.out.println(countAnagrams(text, pattern));
    }
    
    static int countAnagrams(String text, String pattern) {
        if (text.length() == 0 || pattern.length() == 0 || text.length() < pattern.length()) return 0;
        int[] pCount = new int[26];
        for (char c : pattern.toCharArray()) pCount[c - 'a']++;
        
        int[] tCount = new int[26];
        int k = pattern.length();
        for (int i = 0; i < k; i++) tCount[text.charAt(i) - 'a']++;
        
        int ans = 0;
        if (Arrays.equals(pCount, tCount)) ans++;
        
        for (int i = k; i < text.length(); i++) {
            tCount[text.charAt(i) - 'a']++;
            tCount[text.charAt(i - k) - 'a']--;
            if (Arrays.equals(pCount, tCount)) ans++;
        }
        return ans;
    }
}
