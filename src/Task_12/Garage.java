package Task_12;

public class Garage<T extends Vehicle> {
    //    1.4 Реализовать метод в классе Garage, который будет разрешать или запрещать въезд в гараж в зависимости от количество выбросов транспортного средства. (Boolean isEntryPermitted()); Реализовать этот метод: если количество выбросов больше 100, тогда въезд запрещён, если меньше 100 – въезд разрешён.
    private T vehicle;

    public Garage(T vehicle) {
        this.vehicle = vehicle;
    }

    public void setVehicle(T vehicle) {
        this.vehicle = vehicle;
    }

    public T getVehicle() {
        return vehicle;
    }

    public void showVehicleInfo() {
        System.out.println("В гараже: " + vehicle.getName());
        System.out.println("Количество выбросов: " + vehicle.getEmissionQuantity());
        System.out.println("Въезд в гараж " + isEntryPermitted());
    }

    public String isEntryPermitted() {
        return vehicle.getEmissionQuantity() <= 100 ? "Разрешён!" : "Запрещён!";

    }
}
