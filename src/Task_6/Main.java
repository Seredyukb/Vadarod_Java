package Task_6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
         *1. Создать массив из 10 элементов. Заполните массив числами и вывести их в консоль (выводите через цикл for each).
         * Замените каждый элемент с нечётным индексом на ноль. Выведите полученный массив в консоль через цикл for each
        .2. Создать массив из 5 чисел и заполните этот массив вручную.
        * Создайте второй массив с размерностью больше на 1 чем первый массив.
        * Необходимо скопировать первый массив со всеми значениями во второй массив.
        * Последний элемент во втором массиве пусть будет 0. Выведите второй массив в консоль с помощью цикла for each.
        3.* Создать массив вручную. Заменить максимальный и минимальный элемент массива.
        * Новый минимальный элемент будет (-1000), новый максимальный элемент 1000.
        4.* Создать массив (вручную).
        * Отсортировать элементы массива в порядке возрастания.
        * Вывести полученный массив. Выполнить с помощью цикла for
        *  */

        /*
         * *1. Создать массив из 10 элементов. Заполните массив числами и вывести их в консоль (выводите через цикл for each).
         * Замените каждый элемент с нечётным индексом на ноль. Выведите полученный массив в консоль через цикл for each
         * */
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int l : array) {
            System.out.println(l);
        }
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        for (int s : array) {
            System.out.println(s);
        }


        /*
         .2. Создать массив из 5 чисел и заполните этот массив вручную.
        * Создайте второй массив с размерностью больше на 1 чем первый массив.
        * Необходимо скопировать первый массив со всеми значениями во второй массив.
        * Последний элемент во втором массиве пусть будет 0. Выведите второй массив в консоль с помощью цикла for each.
         */

        int arr[] = {1, 2, 3, 4, 5};
        int arr2[] = new int[arr.length + 1];
        System.out.println(arr.length);
        System.out.println(arr2.length);
        //1ый способ: через цикл:
        for (int i = 0; i < arr2.length - 1; i++) {
            arr2[i] = arr[i];
        }
        arr2[arr2.length - 1] = 0;
        System.out.println(arr2);
        for (int s : arr2) {
            System.out.println(s);
        }
        //2ой способ через Clone, но тогда через CopyOf нужно увеличить длину копии - не самый лучший вариант
        int arr3[] = {1, 2, 3, 4, 5};
        int arr4[] = arr3.clone();
        arr4 = Arrays.copyOf(arr4, arr4.length + 1);
        arr4[arr4.length - 1] = 0;
        System.out.println("arr4 = " + Arrays.toString(arr4));
        for (int s : arr4) {
            System.out.println(s);
        }
        System.out.println("original == copy: " + (arr3 == arr4));
        //3-ий вариант через copyOf:
        int arr5[] = {1, 2, 3, 4, 5, 6};
        int arr5Copy[] = Arrays.copyOf(arr5, arr5.length + 1);
        arr5Copy[arr5Copy.length - 1] = 12;
        System.out.println("arr5Copy = " + Arrays.toString(arr5Copy));
        for (int s : arr5Copy) {
            System.out.println(s);
        }
        System.out.println("original == copy: " + (arr5 == arr5Copy));

        /*
        3.* Создать массив вручную. Заменить максимальный и минимальный элемент массива.
        * Новый минимальный элемент будет (-1000), новый максимальный элемент 1000.
        * */
        int arr7[] = {1, 2, 33, 45, 67, 23, 233, 567, 3, 452, 123, 2, 3, 4, 66};
        Arrays.sort(arr7);
        arr7[0] = -1000;
        arr7[arr7.length - 1] = 1000;
        System.out.println(Arrays.toString(arr7));


        /*
        4.* Создать массив (вручную).
        * Отсортировать элементы массива в порядке возрастания.
        * Вывести полученный массив. Выполнить с помощью цикла for
        * */

        int arr77[] = {1, 2, 4, 54, 234, 56, 234, 45, 12, 78, 67, 56};
        Arrays.sort(arr77);
        for (int i = 0; i < arr77.length - 1; i++) {
            System.out.println(arr77[i]);
        }
        int arr88[] = {233, 232, 123, 23, 45, 12, 54, 10};

        for (int q = 0; q < arr88.length - 1; q++) {
            for (int p = 0; p < arr88.length - 1 - q; p++) {
                if (arr88[p] > arr88[p + 1]) {
                    int tmp = arr88[p];
                    arr88[p] = arr88[p + 1];
                    arr88[p + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr88));
    }
}

