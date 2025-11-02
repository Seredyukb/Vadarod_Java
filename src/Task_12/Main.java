package Task_12;

public class Main {
    public static void main(String[] args) {

        Garage<Car> garage1 = new Garage<>(new Car(75, "Toyota"));
        Garage<Motorcycle> garage2 = new Garage<>(new Motorcycle(30, "Triumph"));
        Garage<Car> garage3 = new Garage<>(new Car(130, "LADA"));
        garage1.showVehicleInfo();
        garage2.showVehicleInfo();
        garage3.showVehicleInfo();
    }
}
