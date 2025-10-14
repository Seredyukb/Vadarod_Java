import Task_8.Student;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*String a = Student.hello("Привет, dear Java", "Java");
        String b = Student.hello("Привет, my honey!", "Привет Java");
        System.out.println(a);
        System.out.println(b);
        String c = "Каждая строка, создаваемая с помощью оператора new,литерала (заключенная в двойные апострофы) и ли метода класса, создающего строку, является экземпляром класса String. Особенностью объекта класса String является то, что его значение не может быть изменено после создания объекта при помощи любого метода класса. Изменение строки всегда приводит к созданию нового объекта в heap. Сама объектная ссылка при этом сохраняет прежнее значение и хранится в стеке. Произведенные изменения можно сохранить переинициализируя ссылку.";
        String array[] = c.split(" ");
        System.out.println(Arrays.toString(array));*/

        String text = "Привет мир";
        System.out.println("Было: " + text);
        System.out.println("Стало: " + Student.chgStr(7, text));

        String superText = "Да1та выпуска 8 декабря 1998 года[12]. Кодовое имяPlayground. В данном случае встречается путаница. Выпускались книги, например,Beginning Java 2 by Ivor Horton (Mar 1999), фактически по J2SE 1.2 (бывшее название — Java 2). Вместе с тем по сей день такие книги публикуются, например: Х. М. Дейтел, П. Дж. Дейтел, С. И. Сантри. Технологии программирования на Java2. Распределённые приложения (2011). В то время, когда, как известно, Java 2была исторически заменена следующими релизами, подобные названия книг дезориентируют в понимании, о какой же версии Java они написаны на самом деле. Если J2SE 1.2 принято считать за Java 2, а авторы книг за Java 2 принимают JDK7, это приводит к полной путанице.";
        String resultText = Student.cleanText(superText);
        System.out.println(resultText);

    }
}
