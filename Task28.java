import java.util.*;

class RecommendationEngine28 {
    // Simulating Log4J interactions inside logic using std-out based logger proxy
    
    TreeMap<Integer, List<String>> topItems = new TreeMap<>(Collections.reverseOrder());
    Map<String, Integer> itemScores = new HashMap<>();
    
    public void updateItem(String item, int score) {
        if (itemScores.containsKey(item)) {
            int oldScore = itemScores.get(item);
            topItems.get(oldScore).remove(item);
            if (topItems.get(oldScore).isEmpty()) topItems.remove(oldScore);
        }
        itemScores.put(item, score);
        topItems.computeIfAbsent(score, k -> new ArrayList<>()).add(item);
    }
    
    public List<String> getTopN(int n) {
        List<String> res = new ArrayList<>();
        for (List<String> items : topItems.values()) {
            for (String item : items) {
                res.add(item);
                if (res.size() == n) return res;
            }
        }
        return res;
    }
}

public class Task28 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        RecommendationEngine28 engine = new RecommendationEngine28();
        
        // Stress test up to 10^6
        for (int i = 0; i < 500000; i++) {
            engine.updateItem("Item" + i, i % 100); 
        }
        
        List<String> top10 = engine.getTopN(10);
        long end = System.currentTimeMillis();
        
        System.out.println("Top 10 items: " + top10);
        // INFO level log simulation
        System.out.println("INFO: Execution time: " + (end - start) + "ms");
    }
}
