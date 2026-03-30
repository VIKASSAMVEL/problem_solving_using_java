import java.util.*;
import java.util.stream.*;

class UserAnalytics {
    String name;
    int age;
    String location;
    int activityScore;
    boolean isActive;
    
    public UserAnalytics(String name, int age, String location, int activityScore, boolean isActive) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.activityScore = activityScore;
        this.isActive = isActive;
    }
}

public class Task26 {
    public static double getAverageScore(List<UserAnalytics> users) {
        // Bugfix implemented: Check for null/empty and use orElse(0.0)
        if (users == null || users.isEmpty()) return 0.0;
        
        return users.stream()
            .filter(u -> u.isActive)
            .mapToInt(u -> u.activityScore)
            .average()
            .orElse(0.0);
    }
    
    public static void main(String[] args) {
        // Simple test case highlighting the edge case bug fix
        List<UserAnalytics> list = Arrays.asList(
            new UserAnalytics("A", 20, "US", 50, true),
            new UserAnalytics("B", 30, "UK", 100, false)
        );
        System.out.println("Average Valid Users: " + getAverageScore(list));
        System.out.println("Empty list test: " + getAverageScore(new ArrayList<>()));
    }
}
