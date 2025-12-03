package Task_18;


public class Main {
    public static void main(String[] args) {
        startTwoCars();
        startThreeCars();


    }

    private static void startTwoCars() {
        System.out.println("Старт двух авто одновременно");

        Car car1 = new Car("Jaguar", "345AA-7", 500);
        Car car2 = new Car("Kia", "1374 CX-7", 700);

        car1.start();
        car2.start();

        try {
            car1.join();
            car2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void startThreeCars() {
        System.out.println("Едет первая машина. Далее другие ");

        Car car1 = new Car("Nissan", "1234 CX-7", 1000);
        Car car2 = new Car("ЗАЗ", "7745 CX-5", 1200);
        Car car3 = new Car("LADA", "7788 AA-3", 1700);

        car1.start();

        try {
            car1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        car2.start();
        car3.start();
        try {
            car2.join();
            car3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}


