package de.telran.javastart.lesson6;

public class Lesson6 {
    public static void main(String[] args) {
        /* String a = "DIMA";
        String b = "dima".toUpperCase();

        System.out.println("a: " + b);
        System.out.println("b: " + b);

        System.out.println("DIMA == DIMA " + (a == b));
        System.out.println("DIMA.equals(DIMA) " + a.equals(b)); */

        int number = 1;
        while (number < 10)
        {
            System.out.println("number is : " + number++);
            // number = number + 1;
            // number += 1;
            // number++;
        }

        int a = 18;
        a = a * 8;  // a *= 8;
        a = a + 8;  // a += 8;
        a = a - 8;  // a -= 8;
        a = a % 3;  // a %= 3;

        System.out.println("----------");

        // напишите цикл, который печатает цифры с 20 до 5 с шагом -2
        int numberVar2 = 20;

        while (numberVar2 > 5)
        {
            System.out.println("number is: " + numberVar2);
            numberVar2 = numberVar2 - 2;
        }

        // сосчтайте сумму всех чисел от 1 до 87 включительно
        int numberVar3 = 1;
        int numbersSum = 0;
        while (numberVar3 <= 87)
        {
            numbersSum = numbersSum + numberVar3;
            numberVar3 = numberVar3 + 1;
        }
        System.out.println("Сумма чисел от 1 до 87 включетльно: " + numbersSum);

        // Задача FizzBuzz:
        // пробежаться в цикле от 1 до 50 с шагом 1
        // если переменная делится на 3 без остатка - печатать Fizz
        // если переменная делится на 5 без остатка - печатать Buzz
        // если переменная делится на 3 и на 5 без остатка - печатать FizzBuzz

        int numberVar4 = 1;
        while (numberVar4 <= 50)
        {
            if (numberVar4 % 3 == 0 && numberVar4 % 5 == 0)
            {
                System.out.println(numberVar4 + "- FizzBuzz");
            } else if (numberVar4 % 3 == 0)
            {
                System.out.println(numberVar4 + "- Fizz");
            } else if (numberVar4 % 5 == 0)
            {
                System.out.println(numberVar4 + "- Buzz");
            }
            numberVar4++;
        }
    }
}
