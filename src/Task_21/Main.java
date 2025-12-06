package Task_21;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    //1. Вывести текущую дату в формате (пример формата: 1 апреля 2023). На выходе дата должна быть класса String
    public static void task1() {
        LocalDate today = LocalDate.now();
        System.out.println("LocalDate today " + today);
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("ru"));
        System.out.println("task1 *** DateTimeFormatter formatDate " + formatDate);
        String formattedDate = today.format(formatDate);
        System.out.println(formattedDate);
    }

    //2. Вывести текущую дату в формате (пример формата: 1 апреля 2023, 10:59:20 PM). На выходе дата должна быть класса String
    public static void task2() {
        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter formatToday = DateTimeFormatter.ofPattern("d MMMM yyyy, hh:mm:ss a", new Locale("ru"));
        String formattedDate = today.format(formatToday);
        System.out.println("task2*** " + formattedDate);
    }

    //3. Перевести String (2023-03-19 : 10:12:24 AM) в формат LocalDateTime по умолчанию:
    public static void task3() {
        String dateFromTask = "2023-03-19 : 10:12:24 AM";
        String cleanedDate = dateFromTask.replace(" : ", " ").replace(" AM", "");
        System.out.println(cleanedDate);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(cleanedDate, formatter);
        System.out.println("task3*** LocalDateTime: " + dateTime);
    }

    //4. Перевести String (пн 20.03.23 г. время: 15:07:28  ) в формат LocalDateTime по умолчанию:
    public static void task4() {
        String actualDate = "пн 20.03.23 г. время: 15:07:28";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E dd.MM.yy 'г. время:' HH:mm:ss", new Locale("ru"));
        LocalDateTime dateTime = LocalDateTime.parse(actualDate, formatter);
        System.out.println("task4*** LocalDateTime: " + dateTime);
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }
}
