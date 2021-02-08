package task6;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(4, 1150.0, 6);
        Truck truck = new Truck(6, 15000.0, 1, 7000.0);
        car.print();
        System.out.println("------------------------");
        truck.print();
    }
}
