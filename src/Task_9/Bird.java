package Task_9;

import java.util.Objects;

public class Bird extends Animal {

    private String famility = "";
    private String maxFlightHeight = "";

    public String getFamility() {
        return famility;
    }

    public String getMaxFlightHeight() {
        return maxFlightHeight;
    }

    public Bird(String colorAnimal, int lifeExpectancy, String meal, String famility, String maxFlightHeight) {
        super(colorAnimal, lifeExpectancy, meal);
        this.famility = famility;
        this.maxFlightHeight = maxFlightHeight;
    }

    public void sing() {
        System.out.println(this.famility + " поет");
    }

    public void peck() {
        System.out.println(this.famility + " клюет");
    }

    public void broodEggs() {
        System.out.println(this.famility + " высиживает яйца");
    }

    public void animalPlayed() {
        System.out.println(this.famility + " играет");

    }

    @Override
    public String toString() {
        return super.toString() + "Bird{" +
                "famility='" + famility + '\'' +
                ", maxFlightHeight='" + maxFlightHeight + '\'' +
                '}';
    }

    @Override
    public void animalSounds() {
        System.out.println(this.famility + " щебечет, ТИУ ТИУ ТИУ!");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Bird)) {
            return false;
        }
        Bird bird = (Bird) obj;
        if (famility.equals(bird.getFamility()) && maxFlightHeight.equals(bird.getMaxFlightHeight()) && this.getColorAnimal().equals(bird.getColorAnimal())) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFamility(), getMaxFlightHeight());
    }
}
