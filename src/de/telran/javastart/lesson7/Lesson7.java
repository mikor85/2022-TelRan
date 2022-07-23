package de.telran.javastart.lesson7;

public class Lesson7 {
    public static void main(String[] args) {
        // break
        // множественное условие в цикле

        // найти из диапазона 1 до 1000 первое число, которое делится и на 5 и на 7
        /*int i = 1;
        int alreadyFound = 0;
        while (i <= 10000 && alreadyFound < 2)
        {
            if (i % 5 == 0 && i % 7 == 0 && i % 13 == 0)
            {
                System.out.println("Число: " + i);
                alreadyFound++;
                // break;  // выйти из цикла
            }
            i++;
        }
        */

        /* int i = 1;
        do {
            System.out.println("while " + i);
            i++;
        } while (i <= 5);
        System.out.println("----------");
        for (int j = 1; j <= 5; j++)
        {
            System.out.println("for " + j);
        }
        */

        /*int sumOfNumbers = 0;
        int var1numberId = 1;
        for (int i = 10; i >= 2; i -= 2) {
            sumOfNumbers += i;
            System.out.println("Число номер " + var1numberId + ": " + i);
            var1numberId++;
        }
        System.out.println("Сумма всех числе: " + sumOfNumbers);
         */


        int m = 7;
        // в свитч switch можно использовать только конкретные значения
        switch (m)    // int long short boolean String enum
        {
            case 3:
                System.out.println("three");
                break;
            case 2:
                System.out.println("two");
                break;
            case 1:
                System.out.println("one");
                break;
            default:
                System.out.println("Unknown number");
        }

        /*
        while (true)
        {
            // тело цикла
            if ()
                break;
        }

         */



    }

}
