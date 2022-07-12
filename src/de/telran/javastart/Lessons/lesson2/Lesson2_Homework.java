package de.telran.javastart.Lessons.lesson2;

public class Lesson2_Homework {

    public static void main(String[] args) {
        javaTextTask1();
        System.out.println();

        calculateMaxOilVolume();
        System.out.println();

        calculateMoney();
    }

    public static void javaTextTask1()
    {
        System.out.println("Задание№1:");
        System.out.println("   J    a   v     v  a");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
    }

    public static void calculateMaxOilVolume()
    {
        System.out.println("Задание№2: ");
        int foundationArea = 450;
        int reservoirHeight = 12;
        int servicePipeVolume = 23;
        int maxOilVolume = foundationArea * reservoirHeight - servicePipeVolume;
        System.out.println("Максимальный объём нефти: " + (maxOilVolume));
    }

    public static void calculateMoney()
    {
        System.out.println("Задание№3: ");
        int initialMoney = 41;
        int coffeePrice = 3;
        int appleKiloPrice = 3; // всего 2кг
        int dinnerPrice = 12;
        int bonus = 350;
        int lastMoneyAmount = initialMoney - coffeePrice - appleKiloPrice * 2 -dinnerPrice + bonus;
        System.out.println("У Марты осталось: " + lastMoneyAmount + " евро");
    }
}