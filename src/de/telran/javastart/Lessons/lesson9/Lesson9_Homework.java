package de.telran.javastart.Lessons.lesson9;

import java.util.Arrays;

public class Lesson9_Homework {
    public static void main(String[] args) {

        // Задание №1
        System.out.println("Задание №1:");
        int[] arrayNo1 = new int[]{2, 17, 14, 2};
        System.out.println("Сумма четных элементов: " + sumOfEvenElements(arrayNo1));
        System.out.println("----------");

        // Задание №2
        System.out.println("Задание №2:");
        int[] arrayNo2 = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverseArray(arrayNo2)));
        System.out.println("----------");

        // Задание №3
        System.out.println("Задание №3:");
        int[][] dim2ArrayNo3 = new int[10][10];
        dim2ArrayFillFrom99to0(dim2ArrayNo3);
        //printDim2Array(dim2ArrayNo3);
        print2DArray(dim2ArrayNo3);

        System.out.println("----------");

        // Задание №4
        System.out.println("Задание №4:");
        int[] arrayNo4 = new int[]{-1, 2, -3, 5};
        posMultiplyBy2(arrayNo4);
        System.out.println(Arrays.toString(arrayNo4));
        System.out.println("----------");

        // Задание №5
        System.out.println("Задание №5:");
        int[][] dim2ArrayNo5 = new int[][]
                {
                        {1, 2, 3, -5},
                        {1, 2, 3}
                };
        System.out.println("dim2Array has negative elements: " + positiveDim2ArrayElements(dim2ArrayNo5));
        System.out.println("----------");

        // Задание №6
        System.out.println("Задание №6:");
        int[][] dim2ArrayNo6 = new int[][]
                {
                        {1, 2, 3},
                        {-11},
                        {34, -3},
                };
        System.out.println("Кол-во подмассивов с положительными элементами: " + positiveSubArraysAmount(dim2ArrayNo6));
        System.out.println("----------");

        // Задание №7
        System.out.println("Задание №7:");
        int[][] dim2ArrayNo7 = new int[][]
                {
                        {1, 2, 3},
                        {-11},
                        {34, -3}
                };
        System.out.println("Sum of all positive SubArrays: " + sumOfAllPositiveSubArrays(dim2ArrayNo7));
        System.out.println("----------");

        // Задание №8
        System.out.println("Задание №8:");
        int[] firstArray = new int[]{1, 2, 3, 5};
        int[] secondArray = new int[]{1, 3, 4, 5, 6};
        System.out.println("United array a + b: " + Arrays.toString(unitedArray(firstArray, secondArray)));
        System.out.println("----------");
    }

    // 1. Написать функцию, возвращающую сумму всех четных элементов передаваемого в нее массива. Пример {2, 17, 14} -> 16

    public static int sumOfEvenElements(int[] a) {
        int sum = 0;
        for (int j : a) {
            if (j % 2 == 0) {
                sum += j;
            }
        }
        return sum;
    }

    // 2. Развернуть массив - вернуть передаваемый в функцию массив задом наперед. Пример {17, 4, 5} -> {5,4,17}

    public static int[] reverseArray(int[] a) {
        int[] blankArray = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            blankArray[i] = a[a.length - (i + 1)];
        }
        return blankArray;
    }

    public static void reverseArray2(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
    }

    // 3. Создать двухмерный массив и заполнить его цифрами от 99 до 0

    public static void dim2ArrayFillFrom99to0(int[][] dim2Array) {
        for (int i = 0; i < dim2Array.length; i++) {
            for (int j = 0; j < dim2Array[i].length; j++) {
                dim2Array[dim2Array.length - 1 - i][dim2Array[i].length - 1 - j] = i * dim2Array.length + j;
            }
        }
    }
    // 4. Написать функцию которая умножает на 2 все положительные элементы передаваего в нее массива

    public static void posMultiplyBy2(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                a[i] *= 2;
            }
        }
    }

    // 5. Напишите функцию котрорая принимает двухмерный массив и возвращает true если в нем нет отрицательных элементов

    public static boolean positiveDim2ArrayElements(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < 0) {
                    return false;
                }
            }
        }
        return true;
    }

    // 6. Напишите функцию принимающую двухмерный массив и возвращающую количество подмассивов, содержащих только положительные элементы. Пример {{1,2,3}, {-11}, {34,-3}} -> 1

    public static int positiveSubArraysAmount(int[][] a) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            int check = 0;
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > 0) {
                    check += 1;
                }
            }
            if (check == a[i].length) {
                result++;
            }
        }
        return result;
    }

    // 7. * Вернуть сумму чисел двухмерного массива только для тех подмассивов в которых нет отрицательных элементов. Пример {{1,2,3}, {-11}, {34,-3}} -> 6

    public static int sumOfAllPositiveSubArrays(int[][] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            int checkElements = 0;
            int checkSum = 0;
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] >= 0) {
                    checkElements += 1;
                    checkSum += a[i][j];
                }
            }
            if (checkElements == a[i].length) {
                sum += checkSum;
            }
        }
        return sum;
    }

    // 8. Напишите функцию, принимающую два массива и возвращающую все равные элементы в виде отдельного массива.

    public static int[] unitedArray(int[] a, int[] b) {
        int elCounter = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    elCounter += 1;
                }
            }
        }
        int[] abArray = new int[elCounter];
        int countVar = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    abArray[countVar] = a[i];
                    countVar += 1;
                }
            }
        }
        return abArray;
    }

    // Print Arrays
    public static void printDim2Array(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("sub [" + i + "]: ");
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public static void print2DArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            print1DArray(a[i]);
        }
    }

    public static void print1DArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
    }
}
