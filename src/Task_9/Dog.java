package Task_9;

import java.util.Objects;

public class Dog extends Animal {
    private String name = "";
    private String breed = "";
    private int avgWeight;

    public Dog(String colorAnimal, int lifeExpectancy, String meal, String name, String breed, int avgWeight) {
        super(colorAnimal, lifeExpectancy, meal);
        this.name = name;
        this.breed = breed;
        this.avgWeight = avgWeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAvgWeight() {
        return avgWeight;
    }

    public void setAvgWeight(int avgWeight) {
        this.avgWeight = avgWeight;
    }


    public void bark() {
        System.out.println(this.name + " лает");
    }

    public void bite() {
        System.out.println(this.name + " кусает");
    }

    public void run() {
        System.out.println(this.name + " бегает");
    }

    public void play() {
        System.out.println(this.name + " играет");
    }

    public void jump() {
        System.out.println(this.name + " прыгает");
    }

    @Override
    public String toString() {
        return super.toString() + "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", avgWeight=" + avgWeight +
                '}';
    }

    @Override
    public void animalSounds() {
        System.out.println(this.name + " гавкает, ГАВ!");

    }

    @Override
    public void animalPlayed() {
        System.out.println(this.name + " играет");

    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Dog)) {
            return false;
        }
        Dog dog = (Dog) obj;
        if (name.equals(dog.getName()) && avgWeight == dog.getAvgWeight() && breed.equals(dog.getBreed())) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getBreed(), getAvgWeight());
    }
}
