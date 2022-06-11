package de.telran.javastart.Lessons;

import java.util.Arrays;

public class Lesson9 {
    public static void main(String[] args) {

        // №1 напишите функцию, которая заполняет массив элементами равными 3* индекс массива
        int[] blankArray = new int[4];
        System.out.println(Arrays.toString(multiplyBy3(blankArray)));

        // №2 напишите функцию, которая принимает на вход массив и делает все его отрицательные элементы положительными
        int[] negativeNumbers = new int[]{-21, -1, -3};
        makeElementPositive(negativeNumbers);
        System.out.println(Arrays.toString(negativeNumbers));

        // многомерные массивы
        int[][] dim2Array = new int[][]
                {
                        {1, 7, 3},
                        {-10, 10},
                        {2, 5, 18, 13}
                };

        System.out.println(dim2Array.length);
        System.out.println(dim2Array[2][3]);

        int[] secondSubArray = dim2Array[2];
        System.out.println(secondSubArray[3]);

        dim2Array[1] = new int[]{9};


        int[][] dim2OtherArray = new int[5][];
        dim2OtherArray[3] = secondSubArray;
        System.out.println(dim2OtherArray[0]);
        System.out.println(Arrays.toString(dim2OtherArray[3]));

        int[][] dim2YetAnotherArray = new int[4][10];

        // заполним двухмерный массив 10х10 значениями от 0 до 99

        int[][] array10x10 = new int[10][10];
        for (int i = 0; i < array10x10.length; i++) {
            for (int j = 0; j < array10x10[i].length; j++) {
                array10x10[i][j] = i * array10x10.length + j;
            }
        }

        // трехмерные массивы
        int[][][] dim3Array = new int[][][]
                {
                        {
                                {1, 7, 3},
                                {31},
                                {2, 6, -8, 12, 15}
                        },
                        {
                                {-90, 43, 15},
                                {5},
                        },
                };
        System.out.println("dim3Array.length is: " + dim3Array.length);
        System.out.println(dim3Array[0][2][4]);
    }

    // №1 напишите функцию, которая заполняет массив элементами равными 3* индекс массива
    public static int[] multiplyBy3(int[] a) {
        int[] array = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            array[i] = i * 3;
        }
        return array;
    }

    // №2 напишите функцию, которая принимает на вход массив и делает все его отрицательные элементы положительными
    public static void makeElementPositive(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                a[i] *= -1;
            }
        }
    }
}
