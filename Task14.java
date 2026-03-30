import java.util.*;

abstract class Vehicle {
    int id;
    String modelName;
    double baseRent;

    Vehicle(int id, String modelName, double baseRent) {
        this.id = id;
        this.modelName = modelName;
        this.baseRent = baseRent;
    }

    abstract double calculateRent();
}

class Car extends Vehicle {
    int seats;
    Car(int id, String modelName, double baseRent, int seats) {
        super(id, modelName, baseRent);
        this.seats = seats;
    }
    double calculateRent() {
        return baseRent + (seats * 100);
    }
}

class Bike extends Vehicle {
    int engineCapacity;
    Bike(int id, String modelName, double baseRent, int engineCapacity) {
        super(id, modelName, baseRent);
        this.engineCapacity = engineCapacity;
    }
    double calculateRent() {
        return baseRent + (engineCapacity * 2);
    }
}

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int id = sc.nextInt();
            String model = sc.next();
            double rent = sc.nextDouble();
            int extra = sc.nextInt();
            Vehicle v;
            if (type.equals("C")) v = new Car(id, model, rent, extra);
            else v = new Bike(id, model, rent, extra);
            
            System.out.println("Vehicle ID: " + v.id + ", Model: " + v.modelName + ", Total Rent: " + v.calculateRent());
        }
    }
}
