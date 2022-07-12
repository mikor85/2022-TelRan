package de.telran.javastart.Lessons.lesson8;

public class Lesson8 {
    public static void main(String[] args) {

        int[] intArray = new int[]{15, 8, 10, -5};
        // массив - упорядоченный набор однотипных данных
        // массив - контейнер с переменными, каждая из которых имеет свой порядковый номер
        // нельзя увеличвать или уменьшать кол-во элементов в массиве

        System.out.println(intArray[0]);
        intArray[0] = -33;
        System.out.println(intArray[0]);

        System.out.println("length: " + intArray.length);

        // напишите функцию, которая принимает на вход массив и распечатывает все его элементы
        printArray(intArray);

        String[] names = new String[]{"Dima", "Max", "Kolya"};
        System.out.println(names[2]);
        String[] newNames = names;
        printStringArray(names);

        printStringArray(newNames);
        newNames[1] = "Angelina";
        printStringArray(names);


        // элементы инициализируются значениями по-умолчанию
        int[] blankArray = new int[4];
        printArray(blankArray);

        fillArrayFromZero(blankArray);
        printArray(blankArray);

        printStars(blankArray);

    }

    public static void printStars(int[] a) {
        for (int i = 0; i < a.length; i++) {
            printNChars(a[i], '*');
            System.out.println();
        }
    }

    public static void printNChars(int n, char c) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }


    public static void fillArrayFromZero(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }

    }

    public static void printStringArray(String[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]= " + a[i]);
        }
    }


    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]= " + a[i]);
        }
    }
}
