package de.telran.javastart.Lessons;

import de.telran.javastart.Lessons.lesson15.*;

public class Lesson15 {
    public static void main(String[] args) {
        // наследование классов - способность одного класса
        // использовать и расширять (extends) функциональность другого класса
        // AdvancedIntArray
        // int get(int index)
        // void set(int index, int value)
        // int size()
        // void append(int value)
        // void insert(int index, int value)
        // void delete(int index)
        // boolean contains(int value)

        int [] array = {10, 8, 23};
        array[1] = 88;
        System.out.println(array[2]);
        System.out.println(array.length);

        AdvancedIntArray advancedArray = new AdvancedIntArray(3);
        advancedArray.set(0, 10);
        advancedArray.set(1, 8);
        advancedArray.set(2, 23);

        advancedArray.set(1, 88);
        System.out.println(advancedArray.get(2));
        System.out.println(advancedArray.size());

        Employee misha = new Employee(0, "Misha S.", "IBM", 2200);

        OfficeEmployee dina = new OfficeEmployee(1, "Dina D.", "ORACLE", 2500, 100);
        Employee dina2 = new OfficeEmployee(1, "Dina D.", "ORACLE", 2500, 100);

        System.out.println("Misha's salary: " + misha.getSalary());
        System.out.println("Dina's salary: " + dina.getSalary());
        System.out.println("Dina2's salary: " + dina2.getSalary());

        Manager gennady = new Manager(3, "Gennady M.", "DB", 4000, 1.5);
        System.out.println("Gennady's salary: " + gennady.getSalary());

        HourlyEmployee veronika = new HourlyEmployee(5, "Veronika P.", "DELL", 2500, 200);
        System.out.println("Veronika's salary: " + veronika.getSalary());

        // ПОЛИМОРФИЗМ - это возможность вызвать метод по ссылке на базовый класс

        dina.introduce();
        ((OfficeEmployee)dina).introduce();
        // ошибка, потому что разные дочерние классы ((OfficeEmployee)gennady).introduce();


    }
}
