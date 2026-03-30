import java.util.*;
import java.util.regex.*;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLine()) return;
        String line = sc.nextLine();
        
        String s = "";
        Matcher m = Pattern.compile("s\\s*=\\s*\"([^\"]+)\"").matcher(line);
        if (m.find()) s = m.group(1);
        
        System.out.println(encrypt(s));
    }
    
    static String encrypt(String s) {
        if (s == null || s.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                sb.append(s.charAt(i - 1)).append(Integer.toHexString(count).toLowerCase());
                count = 1;
            }
        }
        sb.append(s.charAt(s.length() - 1)).append(Integer.toHexString(count).toLowerCase());
        return sb.reverse().toString();
    }
}
