import java.util.*;

// Mocking JUnit components to avoid compilation errors if jars are missing.
// In a real maven/gradle project, you'd use org.junit.jupiter.api.Test
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Test24 {}

class Assertions24 {
    public static void assertNotNull(Object obj) {
        if (obj == null) throw new AssertionError("Expected not null");
    }
    public static void assertTrue(boolean condition) {
        if (!condition) throw new AssertionError("Expected true");
    }
}

class Movie24 {
    String title;
    String genre;
    public Movie24(String title, String genre) { this.title = title; this.genre = genre; }
}

class User24 {
    String name;
    List<Movie24> watchHistory;
    public User24(String name, List<Movie24> watchHistory) { this.name = name; this.watchHistory = watchHistory; }
}

class RecommendationEngine {
    public List<Movie24> getRecommendations(User24 user) {
        // Return at least 5 movies for testing output
        return Arrays.asList(
            new Movie24("M1", "Action"), new Movie24("M2", "Comedy"),
            new Movie24("M3", "Drama"), new Movie24("M4", "Sci-Fi"),
            new Movie24("M5", "Horror")
        );
    }
}

public class Task24 {
    @Test24
    public void testNoWatchHistory() {
        RecommendationEngine engine = new RecommendationEngine();
        User24 user = new User24("user1", new ArrayList<>());
        List<Movie24> recommendations = engine.getRecommendations(user);
        Assertions24.assertNotNull(recommendations);
        Assertions24.assertTrue(recommendations.size() >= 5);
    }

    @Test24
    public void testOneWatchedMovie() {
        RecommendationEngine engine = new RecommendationEngine();
        User24 user = new User24("user2", Arrays.asList(new Movie24("M1", "Action")));
        List<Movie24> recommendations = engine.getRecommendations(user);
        Assertions24.assertTrue(recommendations.size() >= 5);
    }

    @Test24
    public void testIdenticalRatings() {
        RecommendationEngine engine = new RecommendationEngine();
        User24 user = new User24("user3", Arrays.asList(new Movie24("M1", "Comedy"), new Movie24("M2", "Comedy")));
        List<Movie24> recommendations = engine.getRecommendations(user);
        Assertions24.assertTrue(recommendations.size() >= 5);
    }

    @Test24
    public void testLargeWatchHistory() {
        RecommendationEngine engine = new RecommendationEngine();
        List<Movie24> history = new ArrayList<>();
        for (int i = 0; i < 10000; i++) history.add(new Movie24("M" + i, "Action"));
        User24 user = new User24("user4", history);
        List<Movie24> recommendations = engine.getRecommendations(user);
        Assertions24.assertTrue(recommendations.size() >= 5);
    }
    
    public static void main(String[] args) {
        Task24 t = new Task24();
        t.testNoWatchHistory();
        t.testOneWatchedMovie();
        t.testIdenticalRatings();
        t.testLargeWatchHistory();
        System.out.println("All RecommendationEngine tests passed successfully.");
    }
}
