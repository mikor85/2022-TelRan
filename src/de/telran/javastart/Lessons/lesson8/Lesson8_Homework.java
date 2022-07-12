package de.telran.javastart.Lessons.lesson8;

import java.util.Arrays;

public class Lesson8_Homework {
    public static void main(String[] args) {

        // Задание №1
        System.out.println("Задание №1:");
        int[] rightArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printArray(reverseArray(rightArray));
        System.out.println("----------");

        // Задание №2
        System.out.println("Задание №2:");
        String text = "Петя";
        //printCharArray(charArrayFromString(text));
        System.out.println(Arrays.toString(charArrayFromString("Петя")));
        System.out.println("----------");

        // Задание №3
        System.out.println("Задание №3:");
        int[] numbersArray = new int[]{-1, -2, 5, 0, -3};
        System.out.println(positiveArrayNumber(numbersArray));
        System.out.println("----------");

        // Задание №4
        System.out.println("Задание №4:");
        int[] checkArray = new int[]{-1, -2, 56, 0, -3, 100, -400};
        int number = 56;
        System.out.println(isNumberInsideArray(checkArray, number));
        System.out.println("----------");

        // Задание №5
        System.out.println("Задание №5:");
        System.out.println(binNumber("2abf"));
        System.out.println("----------");

    }

    // 1. Напишите функцию, принимающую на вход массив int и заполняющую массив в обратном порядке - если в массиве 10 элементов, то сделать значениями элементов 9,8,7 ... 0.

    public static int[] reverseArray(int[] a) {
        int[] blankArray = new int[a.length];
        int j = a.length;
        for (int i = 0; i < a.length; i++, j--) {
            blankArray[i] = a[j - 1];
        }
        return blankArray;
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]= " + a[i]);
        }
    }


    // 2. Напишите функцию, возвращающую массив из char передаваемой в нее строки - "Петя" -> 'П', 'е', 'т', 'я' - обратите внимания на метод String charAt.

    public static char[] charArrayFromString(String text) {
        char[] charArray = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            charArray[i] = text.charAt(i);
        }
        return charArray;
    }

    public static void printCharArray(char[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]= " + a[i]);
        }
    }

    // 3. Напишите функцию, которая определяет, если в передаваемом массиве целых положительные числа, возвращает boolean.

    public static boolean positiveArrayNumber(int[] a) {
        boolean result = false;
        for (int j : a) {
            if (j > 0) {
                result = true;
                break;
            }
        }
        return result;
    }

    // 4. Напишите функцию, которая определяет, если в передаваемом массиве целых заданное целое число, возвращает boolean - на вход функции передается массив целых и целое число.

    public static boolean isNumberInsideArray(int[] a, int number) {
        boolean result = false;
        for (int j : a) {
            if (j == number) {
                result = true;
                break;
            }
        }
        return result;
    }

    // 5. * Напишите функцию, которая для передаваемого туда шестнадцатиричного числа в виде строки возвратит его двоичную запись в виде строки  "1abd" -> "0001 1010 1011 1100".

    public static String binNumber(String hex) {
        StringBuilder binNumber = new StringBuilder();
        for (int i = 0; i < hex.length(); i++) {
            switch (hex.charAt(i)) {
                case '0' -> binNumber.append("0000 ");
                case '1' -> binNumber.append("0001 ");
                case '2' -> binNumber.append("0010 ");
                case '3' -> binNumber.append("0011 ");
                case '4' -> binNumber.append("0100 ");
                case '5' -> binNumber.append("0101 ");
                case '6' -> binNumber.append("0110 ");
                case '7' -> binNumber.append("0111 ");
                case '8' -> binNumber.append("1000 ");
                case '9' -> binNumber.append("1001 ");
                case 'a' -> binNumber.append("1010 ");
                case 'b' -> binNumber.append("1011 ");
                case 'c' -> binNumber.append("1100 ");
                case 'd' -> binNumber.append("1101 ");
                case 'e' -> binNumber.append("1110 ");
                case 'f' -> binNumber.append("1111 ");
            }
        }
        return binNumber.toString();
    }
}
