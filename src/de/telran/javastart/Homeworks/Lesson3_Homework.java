package de.telran.javastart.Homeworks;

import java.util.Scanner;

public class Lesson3_Homework {
    public static void main(String[] args) {
        // Задание №1
        System.out.println("Задание №1 - вычисление площади эллипса:");
        double ellipseAreaFull = ellipseArea(2, 5);
        System.out.println("Площадь эллипса = " + ellipseAreaFull);
        System.out.println();

        // Задание №2
        System.out.println("Задание №2 - вычислене длины окружности:");
        double circleLengthFull = circleLength(5);
        System.out.println("Длина окружности = " + circleLengthFull);
        System.out.println();

        // Задание №3
        System.out.println("Задание №3 - расчет общей суммы на счету в банке:");
        double bankAccountTotalMoney = accountTotalMoney();
        System.out.println("Общая сумма на счету через 5 лет = " + bankAccountTotalMoney);
        System.out.println();

        // Задание №4
        System.out.println("Задание №4 - возврат числа => чётное - 0, нечётное - 1:");
        String evenNumber = "чётное";
        String oddNumber = "нечётное";
        //
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, а затем нажмите ENTER: ");
        int isEvenNum = in.nextInt();
        in.close();
        //
        int isEvenNumber = isEven(isEvenNum);
        if (isEvenNumber == 0) {
            System.out.println("Введено " + evenNumber + " число, поэтому выводим " + isEvenNumber);
        } else {
            System.out.println("Введено " + oddNumber + " число, поэтому выводим " + isEvenNumber);
        }
    }

    // Задание №1 - вычисление площади эллипса.
    public static double ellipseArea(double a, double b) {
        final double pi = 3.14;
        return a * b * Math.PI; // константа из package Math
    }

    // Задание №2 - вычислене длины окружности.
    public static double circleLength(double radius) {
        final double pi = 3.14;
        return 2 * pi * radius;
    }

    // Задание №3 - расчет общей суммы на счету в банке.
    public static double accountTotalMoney()  //  при работе с деньгами используется тип BigDecimal (не происходит потеря точности), тип Double неточный
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите исходную сумму на счету в банке, а затем нажмите ENTER: ");
        double initMon = in.nextDouble();

        System.out.println("Введите процентную ставку, а затем нажмите ENTER: ");
        double yearPercentRate = in.nextDouble();

        System.out.println("Введите срок вклада в годах, а затем нажмите ENTER: ");
        double invTerm = in.nextInt();
        //in.close();

        if (invTerm == 0)
            return initMon;
        else
            for (int i = 1; i <= invTerm; i++) {
                initMon = initMon + initMon * yearPercentRate / 100;
            }
        return initMon;

        //  решение без циклов
        /* BigDecimal p = BigDecimal.valueOf(bankPercent / 100 + 1);
         *  return initialSum.multiply(p.pow(years));  */
    }

    // Задание №4 - Напишите функцию isEven, принимающую на вход целое число, и возвращающую 0 если это число "чётное" и 1 если это число "нечётное".
    public static int isEven(int isEvenNum) {
        return isEvenNum % 2;
    }
}
