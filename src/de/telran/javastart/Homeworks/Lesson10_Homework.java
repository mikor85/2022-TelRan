package de.telran.javastart.Homeworks;

import java.util.Arrays;

public class Lesson10_Homework {
    public static void main(String[] args) {

        // Задание №1
        System.out.println("Задание №1:");
        int[][] dim2ArrayNo1 = new int[][]
                {
                        {1, 2, 3},
                        {-11},
                        {34, -3}
                };
        System.out.println("Кол-во подмассивов с отрицательными элементами: " + calculateNumberOfNegativeSubArrays(dim2ArrayNo1));
        System.out.println("----------");

        // Задание №2
        System.out.println("Задание №2:");
        int[] firstArrayNo21 = new int[]{5, 2, 3, 6};
        int[] secondArrayNo22 = new int[]{1, 10, 2, 7};
        int[] thirdArrayNo23 = new int[]{-2, -4, 6, 0};
        System.out.println("Массив с максимумами из каждой 'тройки': " + Arrays.toString(maxNumbersFromThreeArrays(firstArrayNo21, secondArrayNo22, thirdArrayNo23)));
        System.out.println("----------");

        // Задание №3
        System.out.println("Задание №3:");
        int[] arrayNo3 = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println(Arrays.toString(arrayNo3));
        // selectionSortVer1(arrayNo3);
        selectionSortVer2(arrayNo3);
        System.out.println(Arrays.toString(arrayNo3));
        System.out.println("----------");

        // Задание №4
        System.out.println("Задание №4:");
        int[] arrayNo4 = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println(Arrays.toString(arrayNo4));
        System.out.println(getThirdBiggestNumberFromArray(arrayNo4));
        System.out.println("----------");

    }

    // 1. Напишите функцию, которая принимает двухмерный массив и возвращает количество подмассивов с отрицательными элементами

    public static int calculateNumberOfNegativeSubArrays(int[][] a) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < 0) {
                    result++;
                    break;
                }
            }
        }
        return result;
    }

    // 2. Напишите функцию, которая принимает на вход три массива и возвращает массив с максимами
    // каждой из "троек" числе public static int[] getMaximum(int [] a, int [] b, int [] c) - массивы a, b и c одинаковой длины.
    // Тройками считаютя a[0], b[0], c[0] ... a[n], b[n], c[n], n меняется от 0 до a.length-1

    public static int[] maxNumbersFromThreeArrays(int[] a, int[] b, int[] c) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            //if (a[i] > b[i]) {
            result[i] = Math.max(a[i], Math.max(b[i], c[i]));
            //} else result[i] = Math.max(b[i], c[i]);
        }
        return result;
    }

    public static int[] maximumNumbersFromThreeArrays(int[] a, int[] b, int[] c) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = max(c[i], max(a[i], b[i]));
        }
        return result;
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    // 3. * Написать алгоритм сортировки selection sort (сортировка выбором)

    public static void selectionSortVer1(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minId = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minId]) {
                    minId = j;
                }
            }
            int temp = a[minId];
            a[minId] = a[i];
            a[i] = temp;
        }
    }

    public static void selectionSortVer2(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            swap(i, findMinimumArrayIndex(i, a), a);
        }
    }

    // меняет местами элементы в массиве по индексам
    public static void swap(int firstIndex, int secondIndex, int[] a) {
        int temp = a[firstIndex];
        a[firstIndex] = a[secondIndex];
        a[secondIndex] = temp;
    }

    // ищет индекс минимального элемента
    public static int findMinimumArrayIndex(int from, int[] a) {
        int minIndex = from;
        int minimum = a[minIndex];
        for (int i = from + 1; i < a.length; i++) {
            if (a[i] < minimum) {
                minimum = a[i];
                minIndex = i;
            }
        }
        return minIndex;
    }


    // 4. Напишите функцию, которая найдет третье по величине число в массиве

    public static int getThirdBiggestNumberFromArray(int[] a) {
        int thirdNumber = 0;
        for (int i = 0; i < a.length - 1; i++) {
            swap(i, findMinimumArrayIndex(i, a), a);
            if (i == 2) {
                thirdNumber = a[i];
                break;
            }
        }
        return thirdNumber;
    }
}