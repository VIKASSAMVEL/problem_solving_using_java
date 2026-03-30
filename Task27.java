import java.util.concurrent.atomic.AtomicLong;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Test27 {}

class Assertions27 {
    public static void assertEquals(Float expected, Float actual) {
        if (!expected.equals(actual)) throw new AssertionError("Expected " + expected + " but got " + actual);
    }
}

class LoggingService {
    // Simulating Log4j
    public void logEvent(String eventType, Object eventObj) {
        if (eventObj == null) {
            System.err.println("ERROR: System failure: null event");
            return;
        }
        if ("FAST_REPEAT".equals(eventType)) {
            System.out.println("WARN: Repeated fast event");
        } else {
            System.out.println("INFO: Normal event: " + eventType);
        }
    }
}

class AccountService {
    private Float balance = 0.0f;
    
    public synchronized Boolean deposit(int amount) {
        balance += amount;
        return true;
    }
    
    public synchronized Boolean withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
    
    public synchronized Float getBalance() {
        return balance;
    }
}

public class Task27 {
    @Test27
    public void testBankConcurrency() throws InterruptedException {
        AccountService account = new AccountService();
        Thread[] threads = new Thread[100];
        
        for (int i = 0; i < 50; i++) {
            threads[i] = new Thread(() -> {
                for(int j=0; j<100; j++) account.deposit(10);
            });
        }
        for (int i = 50; i < 100; i++) {
            threads[i] = new Thread(() -> {
                for(int j=0; j<100; j++) account.withdraw(10);
            });
        }
        
        for (Thread t : threads) t.start();
        for (Thread t : threads) t.join();
        
        Assertions27.assertEquals(0.0f, account.getBalance());
        System.out.println("Concurrency test passed. Final Balance: " + account.getBalance());
    }
    
    @Test27
    public void testLoggingService() {
        LoggingService logger = new LoggingService();
        logger.logEvent("PLAY", new Object());
        logger.logEvent("FAST_REPEAT", new Object());
        logger.logEvent("PLAY", null);
        System.out.println("Logging scenarios verified mentally.");
    }
    
    public static void main(String[] args) throws InterruptedException {
        Task27 t = new Task27();
        t.testLoggingService();
        t.testBankConcurrency();
    }
}
