import java.util.*;

interface Notification {
    void sendNotification(String message);
}

class EmailNotification implements Notification {
    public void sendNotification(String message) {
        System.out.println("Sent Email notification: " + message);
    }
}

class SMSNotification implements Notification {
    public void sendNotification(String message) {
        System.out.println("Sent SMS notification: " + message);
    }
}

class PushNotification implements Notification {
    public void sendNotification(String message) {
        System.out.println("Sent Push notification: " + message);
    }
}

public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String msg = sc.next();
            Notification notif = null;
            if (type.equals("E")) notif = new EmailNotification();
            else if (type.equals("S")) notif = new SMSNotification();
            else if (type.equals("P")) notif = new PushNotification();
            
            if (notif != null) {
                notif.sendNotification(msg);
            }
        }
    }
}
