package Task_18.Runnable;


public class Car implements Runnable {

    private String name;
    private String number;
    private int stopTime;

    public Car(String name, String number, int stopTime) {
        this.name = name;
        this.number = number;
        this.stopTime = stopTime;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) ;
            {
                System.out.println("Авто  " + name + " с номером " + number + " едет. Круг " + stopTime);
                Thread.sleep(stopTime);
            }
            System.out.println("Авто " + name + " с номером " + number + " не едет. ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

