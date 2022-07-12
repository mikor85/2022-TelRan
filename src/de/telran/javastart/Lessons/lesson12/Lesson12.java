package de.telran.javastart.Lessons.lesson12;

import java.util.Arrays;

public class Lesson12 {
    public static void main(String[] args) {

        // операции с массивами

        int[] a1 = {1, 2, 3, 4};
        System.out.println(
                Arrays.toString(
                        append(a1, 5)
                )
        );

        int[] a2 = {1, 2, 3, 4};
        int index = 1;
        int number = 20;
        System.out.println(Arrays.toString(a2));
        System.out.println(Arrays.toString(insert(a2, index, number)));

    }

    public static int[] append(int[] a, int number) {
        int[] returnArray = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            returnArray[i] = a[i];
        }
        returnArray[returnArray.length - 1] = number;
        return returnArray;
    }

    public static int[] insert(int[] a, int index, int number) {
        // 
        // вставить "в середину" массива А значение, вернуть новый массив
        int[] retArr = new int[a.length + 1];
        for (int i = 0; i < index; i++) {
            retArr[i] = a[i];
        }
        retArr[index] = number;
        for (int i = index + 1; i < retArr.length; i++) {
            retArr[i] = a[i-1];
        }
        return retArr;
    }
}
