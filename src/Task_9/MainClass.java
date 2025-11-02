package Task_9;

public class MainClass {
    public static void main(String[] args) {
        Bird bird1 = new Bird("Yellow", 10, "worms", "Синица", "3 km");
        bird1.animalPlayed();
        bird1.animalSounds();
        bird1.broodEggs();
        bird1.peck();
        bird1.sing();
        Dog dogDylan = new Dog("Black", 12, "meat", "Dylan", "Labrador", 30);
        dogDylan.animalPlayed();
        dogDylan.animalSounds();
        dogDylan.bark();
        dogDylan.bite();
        dogDylan.jump();
        dogDylan.play();
        System.out.println(bird1.toString());
        System.out.println(dogDylan.toString());
        Animal giraffe = new Animal("orange", 30, ",grass");
        giraffe.animalPlayed();
        giraffe.animalSounds();
        //System.out.println(giraffe.toString());
        // zoo.addAnimal(giraffe);
        //zoo.addAnimal(dogDylan);
        Dog akira = new Dog("blackNwhite", 15, "food", "Akira", "Ammstaff", 25);
        Dog thorn = new Dog("blue", 15, "food", "Thorn", "Ammstaff", 30);
        Bird senya = new Bird("blue", 40, "seals", "parrot", "1 km");
        Bird eagleSaimon = new Bird("black", 5, "worms", "Vorobey", "1 km");
        Lion lion1 = new Lion("orange", 20, "meat");
        Lion lion2 = new Lion("orange", 20, "meat");
        Lion lion3 = new Lion("orange", 20, "meat");

        Zoo zoo = new Zoo();
        zoo.addAnimal(dogDylan);
        zoo.addAnimal(akira);
        zoo.addAnimal(thorn);
        zoo.addAnimal(bird1);
        zoo.addAnimal(senya);
        zoo.addAnimal(eagleSaimon);
        zoo.addAnimal(lion1);
        zoo.addAnimal(lion2);
        zoo.addAnimal(lion3);

        Animal[] animalsInZoo = zoo.getAnimals();
        for (Animal s : animalsInZoo) {
            System.out.println(s);
        }
        for (Animal s : animalsInZoo) {
            s.animalSounds();
            s.animalPlayed();
        }

        Dog taxa1 = new Dog("black", 8, "meat", "Jhonny", "Taxa", 10);
        Dog taxa2 = new Dog("black", 8, "meat", "Jhonny", "Taxa", 10);
        boolean result = taxa1.equals(taxa2);
        System.out.println(result);

        Bird bird3 = new Bird("black", 10, "worms", "bird", "1000");
        Bird bird8 = new Bird("black", 10, "wormZzz", "bird", "1000");
        boolean resultBirdsEquality = bird3.equals(bird8);
        System.out.println(resultBirdsEquality);

        System.out.println(bird3.hashCode() == bird8.hashCode());
        System.out.println(taxa1.hashCode() == taxa2.hashCode());
    }
}
