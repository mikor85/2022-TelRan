package de.telran.javastart.Lessons.lesson10;

import java.util.Arrays;

public class Lesson10 {
    public static void main(String[] args) {

        int[] array1D = {1, 2, 3, 4};
        System.out.println(Arrays.toString(array1D));
        System.out.println(print1DArray(array1D));

        int[] arrayToSort = {12, -6, 7, 4, 10};
        System.out.println(print1DArray(arrayToSort));
        insertionSort(arrayToSort);
        System.out.println(print1DArray(arrayToSort));

        String[] names = {"Sting", "Kirkorov", "Pink Floyd", "Ramstein"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

    }

    public static String print1DArray(int[] a) {
        String result = "[";
        for (int i = 0; i < a.length; i++) {
            result += a[i];
            if (i != a.length - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }

    // сортировки
    // сортировка по возрастанию {1, 9, 3, -5, 81} -> {-5, 1, 3, 9, 81}

    //
    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int j = i;
            while (j >= 1 && a[j] < a[j - 1]) {
                int temp = a[j - 1];
                a[j - 1] = a[j];
                a[j] = temp;
                j--;
            }
        }
    }
}
