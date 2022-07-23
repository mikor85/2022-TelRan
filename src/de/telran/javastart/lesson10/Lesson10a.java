package de.telran.javastart.lesson10;

import java.util.Arrays;

public class Lesson10a {
    public static void main(String[] args) {

        int [] array1D = {1,2,3,4};
        System.out.println(Arrays.toString(array1D));
        System.out.println(print1DArray(array1D));

        int [] arrayToSort = {12, -6, 7,  4,  10};

        System.out.println(print1DArray(arrayToSort));
        insertionSort(arrayToSort);
        System.out.println(print1DArray(arrayToSort));

        String [] names = {"Sting", "Kirkorov", "Pink Floyd", "Ramstein"};
        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

    }

/*
 0 1  2  3  4
--------------
12 -6 7  4  10
-6 12 7  4  10
-6 7  12 4  10
-6 7  4  12 10
-6 4  7  12 10
 */
    public static void insertionSort(int [] a)
    {
        for (int i = 1; i < a.length; i++) {
            int j = i;
            while (j >= 1 && a[j] < a[j-1])
            {
                int temp = a[j-1];
                a[j-1] = a[j];
                a[j] = temp;
                j--;
            }
        }
    }



    public static String print1DArray(int [] a )
    {
        String res = "[";
        for (int i = 0; i < a.length; i++) {
            res += a[i];
            if(i != a.length - 1)
                res += ", ";
        }
        res += "]";
        return res;
    }

    // сортировки
    // {1,  9, 3,-5, 81} ->
    // {-5; 1, 3, 9, 81}
    // вычислительная сложность алгоритма определяется количеством операций
    // котрое нужно для того чтобы успешно завершить его в самом худшем случае
    // n O(n) O(n^2) O(n*log(n))
    // O(n^2)       1000*1000 = 1000000
    // O(n*log(n))  1000*3    = 3000
    //


}
