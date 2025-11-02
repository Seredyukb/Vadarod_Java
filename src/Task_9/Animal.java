package Task_9;

public class Animal {
    private String colorAnimal = "";
    private int lifeExpectancy;
    private String meal = "";

    public Animal(String colorAnimal, int lifeExpectancy, String meal) {
        this.colorAnimal = colorAnimal;
        this.lifeExpectancy = lifeExpectancy;
        this.meal = meal;
    }

    public String getColorAnimal() {
        return colorAnimal;
    }

    public int getLifeExpectancy() {
        return lifeExpectancy;
    }

    public String getMeal() {
        return meal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "colorAnimal='" + colorAnimal + '\'' +
                ", lifeExpectancy=" + lifeExpectancy +
                ", meal='" + meal + '\'' +
                '}';
    }

    public void animalSounds() {
        System.out.println("Животное издает звук");
    }

    public void animalPlayed() {
        System.out.println("Животное играет");
    }
}
