import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;

class Event {
    String name;
    LocalDate date;

    Event(String name, String date) {
        this.name = name;
        this.date = LocalDate.parse(date); // yyyy-MM-dd
    }

    String getName() {
        return name;
    }

    LocalDate getDate() {
        return date;
    }
}

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Event> events = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String date = sc.next();
            events.add(new Event(name, date));
        }

        int month = sc.nextInt();

        List<Event> sortedEvents = events.stream()
                .sorted(Comparator.comparing(Event::getDate))
                .collect(Collectors.toList());

        sortedEvents.forEach(e -> System.out.print(e.getName() + " "));
        System.out.println();

        System.out.println(sortedEvents.get(0).getName());

        System.out.println(sortedEvents.get(sortedEvents.size() - 1).getName());
        events.stream()
                .filter(e -> e.getDate().getMonthValue() == month)
                .forEach(e -> System.out.print(e.getName() + " "));

        sc.close();
    }
}