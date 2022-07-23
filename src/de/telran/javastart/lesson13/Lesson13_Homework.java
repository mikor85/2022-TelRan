package de.telran.javastart.lesson13;

import java.util.Arrays;

public class Lesson13_Homework {
    public static void main(String[] args) {

        LoanTaker alex = new LoanTaker(30, 15_000);
        LoanTaker max = new LoanTaker(30, 25_000);
        LoanTaker vadim = new LoanTaker(50, 25_000);
        LoanTaker vova = new LoanTaker(70, 25_000);
        LoanTaker valera = new LoanTaker(80, 25_000);

        LoanIssuer ivanov = new LoanIssuer(true, true);
        LoanIssuer petrov = new LoanIssuer(true, false);
        LoanIssuer sidorov = new LoanIssuer(false, true);
        LoanIssuer kozlov = new LoanIssuer(false, false);

        // ленивый и добрый
        System.out.println("Иванов - Ленивый и добрый:");
        System.out.println("alex: " + ivanov.checkLoanTaker(alex));     // false
        System.out.println("max: " + ivanov.checkLoanTaker(max));      // true
        System.out.println("vadim: " + ivanov.checkLoanTaker(vadim));    // true
        System.out.println("vova: " + ivanov.checkLoanTaker(vova));     // true
        System.out.println("valera: " + ivanov.checkLoanTaker(valera));   // true
        System.out.println("----------");

        // ленивый и злой
        System.out.println("Петров - Ленивый и злой:");
        System.out.println("alex: " + petrov.checkLoanTaker(alex));     // false
        System.out.println("max: " + petrov.checkLoanTaker(max));      // true
        System.out.println("vadim: " + petrov.checkLoanTaker(vadim));    //
        System.out.println("vova: " + petrov.checkLoanTaker(vova));     //
        System.out.println("valera: " + petrov.checkLoanTaker(valera));   //
        System.out.println("----------");

        // неленивый и добрый
        System.out.println("Сидоров - Неленивый и добрый:");
        System.out.println("alex: " + sidorov.checkLoanTaker(alex));    // false
        System.out.println("max: " + sidorov.checkLoanTaker(max));     // true
        System.out.println("vadim: " + sidorov.checkLoanTaker(vadim));   //
        System.out.println("vova: " + sidorov.checkLoanTaker(vova));    //
        System.out.println("valera: " + sidorov.checkLoanTaker(valera));  //
        System.out.println("----------");

        // неленивый и злой
        System.out.println("Козлов - Неленивый и злой:");
        System.out.println("alex: " + kozlov.checkLoanTaker(alex));     // false
        System.out.println("max: " + kozlov.checkLoanTaker(max));      // true
        System.out.println("vadim: " + kozlov.checkLoanTaker(vadim));    //
        System.out.println("vova: " + kozlov.checkLoanTaker(vova));     //
        System.out.println("valera: " + kozlov.checkLoanTaker(valera));   //
        System.out.println("----------");


        // Task Nr.1
        System.out.println("Task Nr.1:");
        int[] arr31 = new int[]{0, 1, 3, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr32 = new int[]{1, 5, 7, 12, 15};
        int number = 6;
        System.out.println("Present array is: " + Arrays.toString(arr32));
        //System.out.println(findPlaceOfNumber(arr32, 1));
        //System.out.println("----------");
        System.out.println(binarySearch(arr32, 1));
        System.out.println("----------");

    }

    // Написать функцию которая принимает отсортированный массив и число.
    // Возвращает позицию числа в массиве, если число там уже есть, либо индекс места, куда это число можно вставить,
    // не нарушив порядок сортировки массива findPlace({1,5,7,12,15}, 7) ->2  findPlace({1,5,7,12,15}, 4) -> 1
    // - реализовать методом binary search (двоичного поиска)


    //  0   1   2   3   4   5   6   7   8   9   10   11   12   13   14   15
    //  -   -   -   -   -   -   -   -   -   -   --   --   --   --   --   --
    //  1   3  10  15  25  50  75  100 130 190  200  250  400  700  900  1000

    public static int findPlaceOfNumber(int[] sortedArray, int number) {
        int left = 0;
        int right = sortedArray.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (sortedArray[left] < number) {
                left = mid + 1;
            } else if (number < sortedArray[right]) {
                right = mid - 1;
            } else return mid;
        }
        return left;
    }

    public static int binarySearch(int[] a, int number) {
        int minIndex = 0;
        int maxIndex = a.length - 1;
        while (minIndex <= maxIndex) {
            int midIndex = (minIndex + maxIndex) / 2;
            if (a[minIndex] < number) {
                minIndex = midIndex + 1;
            } else if (number < a[maxIndex]) {
                maxIndex = midIndex - 1;
            } else return midIndex;
        }
        return minIndex;
    }
}


// тот кто берет кредит - кредитополучатель
class LoanTaker {
    int age;
    int annualSalary; // годовая зарплата

    // цель конструктора правильно проинициализировать поля класса
    public LoanTaker(int age, int annualSalary) {
        // this - ссылка на экземпляр класса
        // используется в методах класса и в конструкторах
        this.age = age;
        this.annualSalary = annualSalary;
    }
}

// принимает решение давать кредит или нет
class LoanIssuer {
    boolean isLazy;  // является ли он ленивым
    boolean isKind;  // является ли он добрым

    public LoanIssuer(boolean isLazy, boolean isKind) {
        this.isLazy = isLazy;
        this.isKind = isKind;
    }

    // Если работник ленивый, то он одобрит кредит когда доход больше 20_000
    // Если работник неленивый но добрый, то он одобрит кредит при доходе больше 20_000 и возрасте не больше 70 лет
    // Если работник неленивый и злой, то он одобррит кредит при доходе больше 20_000 и возрасте не больше 50 лет
    boolean checkLoanTaker(LoanTaker loanTaker) {
        // TODO написать функцию проверяющую кредитополучателя
        if (loanTaker.annualSalary > 20_000) {
            if (isLazy) {
                return true;
            } else if (isKind) {
                return loanTaker.age <= 70;
            } else {
                return loanTaker.age <= 50;
            }
        } else {
            return false;
        }
    }
}