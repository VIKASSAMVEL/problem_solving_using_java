import java.util.*;

class Account {
    int id;
    String name;
    long balance;

    Account(int id, String name, long balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
}

class Bank {
    Map<Integer, Account> accounts = new LinkedHashMap<>();

    void addAccount(Account acc) {
        accounts.put(acc.id, acc);
    }

    void deposit(int id, long amt) {
        Account acc = accounts.get(id);
        if (acc == null) {
            System.out.println("Account not found");
            return;
        }
        acc.balance += amt;
        System.out.println("Deposited " + amt + " to " + acc.name);
    }

    void withdraw(int id, long amt) {
        Account acc = accounts.get(id);
        if (acc == null) {
            System.out.println("Account not found");
            return;
        }
        if (acc.balance < amt) {
            System.out.println("Insufficient balance");
            return;
        }
        acc.balance -= amt;
        System.out.println("Withdrawn " + amt + " from " + acc.name);
    }

    void transfer(int id1, int id2, long amt) {
        Account acc1 = accounts.get(id1);
        Account acc2 = accounts.get(id2);
        if (acc1 == null || acc2 == null) {
            System.out.println("Account not found");
            return;
        }
        if (acc1.balance < amt) {
            System.out.println("Insufficient balance");
            return;
        }
        acc1.balance -= amt;
        acc2.balance += amt;
        System.out.println("Transferred " + amt + " from " + acc1.name + " to " + acc2.name);
    }
}

public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        Bank bank = new Bank();
        for (int i = 0; i < n; i++) {
            bank.addAccount(new Account(sc.nextInt(), sc.next(), sc.nextLong()));
        }
        int ops = sc.nextInt();
        for (int i = 0; i < ops; i++) {
            String op = sc.next();
            if (op.equals("DEPOSIT")) {
                bank.deposit(sc.nextInt(), sc.nextLong());
            } else if (op.equals("WITHDRAW")) {
                bank.withdraw(sc.nextInt(), sc.nextLong());
            } else if (op.equals("TRANSFER")) {
                bank.transfer(sc.nextInt(), sc.nextInt(), sc.nextLong());
            }
        }
    }
}
