package de.telran.javastart.Lessons.lesson11;

import java.util.Arrays;

public class Lesson11_Homework {
    public static void main(String[] args) {

        // Task Nr.1
        System.out.println("Task Nr.1:");
        int[] arrayNo1 = new int[]{0, 2, 2, 2, 3, 3, 4, 5, 5, 7};
        int[] a1 = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] a2 = new int[]{1, 2, 3, 3, 3, 3};
        int positionOfMaximumNumber = 3;
        System.out.println("Present array is: " + Arrays.toString(arrayNo1));
        selectionSortFromBiggestToSmallest(arrayNo1);
        System.out.println(positionOfMaximumNumber + " maximum number in present array is: " + getThirdBiggestNumberFromArray(arrayNo1, positionOfMaximumNumber));
        System.out.println("----------");
        System.out.println("Present array is: " + Arrays.toString(a2));
        System.out.println(positionOfMaximumNumber + " maximum number in present array is: " + getThirdBiggest(a2));
        System.out.println("----------");

        // Task Nr.2
        System.out.println("Task Nr.2:");
        int[] firstArray = new int[]{1, 2, 3, 4};
        int[] secondArray = new int[]{1, 3, 6, 5};
        System.out.println("United array a + b: " + Arrays.toString(unitedArray(firstArray, secondArray)));
        System.out.println("----------");

        // Task Nr.3
        System.out.println("Task Nr.3:");
        int[] arrayNo3 = new int[]{1, 2, 3, 4};
        System.out.println("Average Of Array Elements is: " + getAverageOfAllElements(arrayNo3));
        System.out.println("----------");

        // Task Nr.4
        System.out.println("Task Nr.4:");
        int[] arrayNo4 = new int[]{1, 2, 3, 4};
        System.out.println("Dispersion Of Array Elements is: " + dispersion(arrayNo4));
        System.out.println("----------");

        // Task Nr.5
        System.out.println("Task Nr.5:");
        int[] bigArr = new int[]{1, 1, 2, 2, 2, 3, 4, 5, 6, 7};
        int[] smallArr = new int[]{1, 2, 2, 2, 3};
        System.out.println("All elements of the small array are found in the large array: " + findAllSmallArrayInBigArray(bigArr, smallArr));
        System.out.println("----------");

        // Task Nr.6
        System.out.println("Task Nr.6:");
        int[] arrayNo6 = new int[]{1, 2, 3, 4, 5};
        System.out.println("Sum Of Array Elements is: " + calculateSumOfArrayElements(arrayNo6, arrayNo6.length));
        System.out.println("----------");
        System.out.println("Sum Of Array Elements is: " + calculateArraySum(arrayNo6, 0, arrayNo6.length));
        System.out.println("----------");

        // Task Nr.7
        System.out.println("Task Nr.7:");
        int firstNumber = 30;
        int secondNumber = 15;
        System.out.println("Common factor of two Numbers is: " + getCommonFactorRecursion2(firstNumber, secondNumber));
        System.out.println("----------");
    }

    /*============================================================================*/
    // 1. Напишите функцию, которая вернет третье по величине число в массиве. Пример: 1 2 3 4 5 6 7 -> 5 и еще пример: 1 2 3 3 3 3   -> 1
    public static int getThirdBiggestNumberFromArray(int[] a, int positionOfMaximumNumber) {
        int numberIndex = 0;
        int stepCounter = 1;
        int i = 1;
        while (i < a.length && stepCounter < positionOfMaximumNumber) {
            if (a[i - 1] != a[i]) {
                numberIndex = i;
                stepCounter++;
            }
            i++;
        }
        return a[numberIndex];
    }

    public static int getThirdBiggest(int[] a) {
        Arrays.sort(a);
        int counter = 3;
        int prevMax = a[a.length - 1];
        for (int i = a.length - 2; i >= 0 && counter > 0; i--) {
            if (a[i] < prevMax) {
                prevMax = a[i];
                counter--;
            }
        }
        return prevMax;
    }

    // сортировка от максимального к наименьшему
    public static void selectionSortFromBiggestToSmallest(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            swap(i, findMaximumArrayIndex(i, a), a);
        }
    }

    // меняет местами элементы в массиве по индексам
    public static void swap(int firstIndex, int secondIndex, int[] a) {
        int temp = a[firstIndex];
        a[firstIndex] = a[secondIndex];
        a[secondIndex] = temp;
    }

    // ищет индекс максимального элемента
    public static int findMaximumArrayIndex(int from, int[] a) {
        int maxIndex = from;
        int maximum = a[maxIndex];
        for (int i = from + 1; i < a.length; i++) {
            if (a[i] > maximum) {
                maximum = a[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    /*============================================================================*/
    // 2. Написать функцию которая вернет в виде массива общие элементы двух массивов. Пример: {1,2,3,4} {1,3,6,5} -> {1,3}

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
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    abArray[counter] = a[i];
                    counter += 1;
                }
            }
        }
        return abArray;
    }

    public static int[] getCommonElements(int[] a, int[] b) {
        int size = Math.min(a.length, b.length);
        int[] c = new int[size];
        Arrays.sort(a);
        Arrays.sort(b);
        // {1,2,3,4} ia
        // {1,3,5}   ib
        for (int ia = 0, ib = 0, ic = 0; ia < a.length && ib < b.length; ) {
            if (a[ia] == b[ib]) {
                c[ic++] = a[ia];
                ia++;
                ib++;
            } else if (a[ia] < b[ib])
                ia++;
            else
                ib++;
        }
        int maxIndex = c.length - 1;
        for (int i = maxIndex; i >= 0; i--) {
            if (c[i] != 0) {
                maxIndex = i;
                break;
            }
        }
        int[] ret = new int[maxIndex + 1];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = c[i];
        }
        return ret;
    }

    /*============================================================================*/
    // 3. Напишите функцию которая вернет среднее значение элементов массива double . Пример: {1,2,3,4} -> 2.5

    public static double getAverageOfAllElements(int[] a) {
        return calculateSumOfArrayElements(a, a.length) / a.length;
    }

    /*============================================================================*/
    // 4. Напишите функцию которая вернет диcперсию значений массива double
    // (формулу для дисперсии можно посмотреть в википедии), квадратный корень вычисляется с помощью Math.sqrt()

    public static double dispersion(int[] a) {
        double averageVar = getAverageOfAllElements(a);
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += Math.pow((a[i] - averageVar), 2);
            //sum += Math.sqrt(a[i] - averageVar);
        }
        return sum / a.length;
    }

    /*============================================================================*/
    // 5. Напишите функцию, в которую передаются два массива - "большой" и "маленький"  - функция должна вернуть true если все элементы "маленького" содержатся в "большом"

    public static boolean findAllSmallArrayInBigArray(int[] bigArr, int[] smallArr) {
        selectionSortFromSmallestToBiggest(bigArr);
        selectionSortFromSmallestToBiggest(smallArr);
        int comparisonOfEquals = 0;
        int countBigArrayIndex = 0;
        for (int i = 0; i < smallArr.length; i++) {
            while (countBigArrayIndex < bigArr.length) {
                if (smallArr[i] == bigArr[countBigArrayIndex]) {
                    comparisonOfEquals++;
                    countBigArrayIndex++;
                    break;
                }
                countBigArrayIndex++;
            }
        }
        return comparisonOfEquals == smallArr.length;
    }

    // сортировка от наименьшего к наибольшему
    public static void selectionSortFromSmallestToBiggest(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            swap(i, findMinimumArrayIndex(i, a), a);
        }
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

    /*============================================================================*/
    // 6. Напишите функцию которая рекурсивно посчитает и вернет сумму элементов массива целых

    public static double calculateSumOfArrayElements(int[] a, int n) {
        if (n <= 0) {
            return 0;
        }
        return calculateSumOfArrayElements(a, n - 1) + a[n - 1];
    }

    public static int calculateArraySum(int[] a, int firstIndex, int lastIndex) {
        if (firstIndex == lastIndex - 1) {
            return a[firstIndex];
        } else {
            int middle = (firstIndex + lastIndex) / 2;
            return calculateArraySum(a, firstIndex, middle) + calculateArraySum(a, middle, lastIndex);
        }
    }

    /*============================================================================*/
    // 7. Напишите функцию которая (желательно рекурсивно) посчитает Наибольший Общий Делитель двух целых по алгоритму Евклида

    public static int getCommonFactor(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else b -= a;
        }
        return a;
    }

    public static int getCommonFactorRecursion(int a, int b) {
        if (b != 0) {
            return getCommonFactorRecursion(b, a % b);
        } else return a;
    }

    public static int getCommonFactorRecursion2(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getCommonFactorRecursion2(b, a % b);
    }
}
