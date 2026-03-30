import java.util.*;

class EntityRecord {
    int id;
    String student;
    String course;
    String instructor;
    String startDate;
    int duration;

    EntityRecord(int id, String student, String course, String instructor, String startDate, int duration) {
        this.id = id;
        this.student = student;
        this.course = course;
        this.instructor = instructor;
        this.startDate = startDate;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Enrollment_ID: " + id + ", Student: " + student + ", Course: " + course + 
               ", Instructor: " + instructor + ", Start Date: " + startDate + ", Duration: " + duration + " weeks";
    }
}

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        List<EntityRecord> records = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            records.add(new EntityRecord(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt()));
        }
        for (EntityRecord r : records) {
            System.out.println(r);
        }
    }
}
