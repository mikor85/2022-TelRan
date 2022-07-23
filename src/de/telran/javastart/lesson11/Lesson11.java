package de.telran.javastart.lesson11;

public class Lesson11 {
    public static void main(String[] args) {

        // посчтать сумму всех чисел в массиме с нечетными индексами
        int sum = 0;
        int[] array = new int[]{1, 5, 7, -10, 2};
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                continue;  // переход к следующей итерации цикла
            }
            sum += array[i];
        }

        // нужно убедиться, что в двухмерном массиве есть определенное число
        int[][] array2D = new int[][]
                {
                        {11, 43, 1},
                        {-12},
                        {14, 44, -2, -10}
                };
        int number = -12;
        quitFor:
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                if (array2D[i][j] == number)
                    break quitFor;
            }
        }

        // РЕКУРСИЯ
        // Рекурсия - это вызов функции самой себя
        // Рекурсия требует двух условий
        // Нужна задача, которая имеет рекурентное решение
        // Условия остановки алгоритма: точка в которой алгоритм останавливается

        /*
        f(n) = 2^n
        f(n) = 2 * f(n-1) = 2 * 2^(n-1)
        f(n) = 2 * f(n-1) = 2 * 2 * f(n-2) = 2 * 2 * 2^(n-2)
        точка остановки алгоритма - это n = 0
         */

        System.out.println(f(10));
        System.out.println(factorial(0));


    }

    // функция возведения 2 в степень n
    public static long f(int n) {
        if (n == 0)
            return 1;
        return 2 * f(n - 1);
    }

    // вычисление факториала n!
    public static long factorial(int n) {
        if (n == 0)
            return 1;
        return n*factorial(n-1);
    }
}
