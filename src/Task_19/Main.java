package Task_19;

public class Main {
    public static void main(String[] args) {
        //1.1 лямбда выражение, которое будет возвращать строку с большими буквами

        StringProcessor toUpperCase = input -> input.toUpperCase();

        String original = "Hello world!";
        String result = toUpperCase.process(original);

        System.out.println("Исходная строка: " + original);
        System.out.println("Измененная строка: " + result);

    }
}
