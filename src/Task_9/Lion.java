package Task_9;

public class Lion extends Animal {
    public Lion(String colorAnimal, int lifeExpectancy, String meal) {
        super(colorAnimal, lifeExpectancy, meal);
    }

    @Override
    public void animalPlayed() {
        System.out.println("Лев играет");
    }

    @Override
    public void animalSounds() {
        System.out.println("Лев рычит!");
    }
}
