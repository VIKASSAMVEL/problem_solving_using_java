import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EventScheduler {

    static class Event {
        String name;
        LocalDate date;

        public Event(String name, LocalDate date) {
            this.name = name;
            this.date = date;
        }

        public String getName() {
            return name;
        }

        public LocalDate getDate() {
            return date;
        }
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line = reader.readLine();
            if (line == null || line.trim().isEmpty()) {
                return;
            }
            int n = Integer.parseInt(line.trim());

            List<Event> events = new ArrayList<>();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            for (int i = 0; i < n; i++) {
                line = reader.readLine();
                if (line != null) {
                    String[] parts = line.trim().split(" ");
                    if (parts.length == 2) {
                        String name = parts[0];
                        LocalDate date = LocalDate.parse(parts[1], formatter);
                        events.add(new Event(name, date));
                    }
                }
            }

            // 1. Sort all events chronologically
            events.sort(Comparator.comparing(Event::getDate));

            // Print sorted events
            System.out.println(events.stream()
                    .map(Event::getName)
                    .collect(Collectors.joining(" ")));

            // 2. Earliest and Latest events
            if (!events.isEmpty()) {
                System.out.println(events.get(0).getName()); // Earliest
                System.out.println(events.get(events.size() - 1).getName()); // Latest
            }

            // 3. Filter by month
            line = reader.readLine();
            if (line != null) {
                int queryMonth = Integer.parseInt(line.trim());
                String monthEvents = events.stream()
                        .filter(e -> e.getDate().getMonthValue() == queryMonth)
                        .map(Event::getName)
                        .collect(Collectors.joining(" "));
                if (!monthEvents.isEmpty()) {
                    System.out.println(monthEvents);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
