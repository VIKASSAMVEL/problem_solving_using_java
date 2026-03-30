import java.util.*;

interface PerformOperation {
    boolean check(int n);
}

public class Task2 {

    // Check Odd / Even
    static PerformOperation isOdd() {
        return n -> n % 2 != 0;
    }

    // Check Prime / Composite
    static PerformOperation isPrime() {
        return n -> {
            if (n <= 1) return false;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        };
    }

    // Check Palindrome
    static PerformOperation isPalindrome() {
        return n -> {
            int original = n, rev = 0;
            while (n > 0) {
                rev = rev * 10 + n % 10;
                n /= 10;
            }
            return original == rev;
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // number of test cases

        while (T-- > 0) {
            int condition = sc.nextInt();
            int number = sc.nextInt();

            switch (condition) {
                case 1:
                    System.out.println(isOdd().check(number) ? "ODD" : "EVEN");
                    break;

                case 2:
                    System.out.println(isPrime().check(number) ? "PRIME" : "COMPOSITE");
                    break;

                case 3:
                    System.out.println(isPalindrome().check(number) ? "PALINDROME" : "NOT PALINDROME");
                    break;
            }
        }
        sc.close();
    }
}