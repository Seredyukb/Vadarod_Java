package Task_18.Runnable;

public class Main {
    public static void main(String[] args) {
        Thread car1 = new Thread(new Car("Mazda", "1132 KK-7", 590));
        Thread car2 = new Thread(new Car("Bentley", "555 AAA-8", 900));

        car1.start();
        car2.start();

        try {
            car1.join();
            car2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

