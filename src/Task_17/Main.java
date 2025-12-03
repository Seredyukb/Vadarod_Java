package Task_17;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        first();
        second();
        third();
        fourth();

        Car car = new Car("Mazda", 300, "Europe");
        String string = "src/Car.txt";
        serializeCar(car, string);
        Car deserializedCar = deserializeCar(string);
        System.out.println("\nDeserialized Car:\n" + deserializedCar);


    }

    private static void first() {
        File file = new File("D:\\Brainscloud\\Java школа!\\Java Projects\\Vadarod_Java\\src\\Task_17\\Text1.txt");
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write("The Rostóvs knew everybody in Moscow. The old count had money enough that year, as all his estates " +
                    "had been remortgaged, and so Nicholas, acquiring a trotter of his own, very stylish riding breeches of the " +
                    "latest cut, such as no one else yet had in Moscow, and boots of the latest fashion, with extremely pointed toes " +
                    "and small silver spurs, passed his time very gaily. After a short period of adapting himself to the old" +
                    " conditions of life, Nicholas found it very pleasant to be at home again. He felt that he had grown up and " +
                    "matured very much. His despair at failing in a Scripture examination, his borrowing money from Gavríl to pay a " +
                    "sleigh driver, his kissing Sónya on the sly—he now recalled all this as childishness he had left immeasurably" +
                    " behind. Now he was a lieutenant of hussars, in a jacket laced with silver, and wearing the Cross of St. George," +
                    " awarded to soldiers for bravery in action, and in the company of well-known, elderly, and respected racing " +
                    "men was training a trotter of his own for a race. He knew a lady on one of the boulevards whom he visited of " +
                    "an evening. He led the mazurka at the Arkhárovs’ ball, talked about the war with Field Marshal Kámenski, " +
                    "visited the English Club, and was on intimate terms with a colonel of forty to whom Denísov had introduced him. ");

        } catch (Exception e) {
            throw new RuntimeException("Ошибка записи файла при работе с относ-ным путем", e);
        }

    }

    private static void second() {
        File file = new File("src\\Text2.txt");
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write("The Rostóvs knew everybody in Moscow. The old count had money enough that year, as all his estates had been remortgaged, and so Nicholas, acquiring a trotter of his own, very stylish riding breeches " +
                    "of the latest cut, such as no one else yet had in Moscow, and boots of the latest fashion, with extremely pointed toes and small silver spurs, passed his " +
                    "time very gaily. After a short period of adapting himself to the old conditions of life, Nicholas found it very pleasant to be at home again. He felt that he " +
                    "had grown up and matured very much. His despair at failing in a Scripture examination, his borrowing money from Gavríl to pay a sleigh driver, his " +
                    "kissing Sónya on the sly—he now recalled all this as childishness he had left immeasurably behind. Now he was a lieutenant of hussars, in a jacket laced with " +
                    "silver, and wearing the Cross of St. George, awarded to soldiers for bravery in action, and in the company of well-known, elderly, and respected racing men was " +
                    "training a trotter of his own for a race. He knew a lady on one of the boulevards whom he visited in the evening. He led the mazurka at the Arkhárovs’ ball, talked about the war with Field Marshal Kámenski, " +
                    "visited the English Club, and was on intimate terms with a colonel of forty to whom Denísov had introduced him.");
        } catch (Exception e) {
            throw new RuntimeException("Ошибка записи файла при работе с абс-ным путем", e);
        }
    }

    private static void third() {
        File file = new File("D:\\Brainscloud\\Java школа!\\Java Projects\\Vadarod_Java\\src\\Task_17\\Text1.txt");
        try (FileReader fileReader = new FileReader(file, StandardCharsets.UTF_8)) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String text = bufferedReader.readLine();
            System.out.println("Содержимое файла GitLessons\\Text1.txt:");
            System.out.println(text);
        } catch (Exception e) {
            throw new RuntimeException("Ошибка при чтении файла Task_17\\Text1.txt", e);
        }
    }

    private static void fourth() {
        File file = new File("src\\Text2.txt");
        try (FileReader fileReader = new FileReader(file, StandardCharsets.UTF_8)) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String text = bufferedReader.readLine();
            System.out.println("Содержимое файла src\\Text2.txt:");
            System.out.println(text);
        } catch (Exception e) {
            throw new RuntimeException("Ошибка при чтении файла c:src\\Text2.txt", e);
        }
    }

    public static void serializeCar(Car car, String file) {

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(car);
        } catch (Exception e) {
            throw new RuntimeException("Ошибка сериализации");
        }
    }

    //Десериализация
    public static Car deserializeCar(String file) {

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            Car carResult = (Car) objectInputStream.readObject();
            return carResult;
        } catch (Exception e) {
            throw new RuntimeException("Ошибка десериализации");
        }
    }
}


