package de.telran.javastart.Lessons.lesson15;

        // ДЗ:
        // 1. Дописать AdvancedIntArray.
        // 2. Расширьте класс OfficeEmployee, чтобы работнику можно было бы назначить менеджера (добавьте метод  setManager(Manager) и поле manager)  dina.setManager(gennady).
        // 3. Добавьте в introduce класса OfficeEmployee сведения о менеджере - "Name is: Dina D company: oracle bonus: 100 manager: Gennady M".
        // 4. * Поправьте класс Employee таким образом чтобы идентификатор работника генерировался самостоятельно и его не надо было каждый раз передавать в конструктор. Идентификатор должен автоматически увеличиваться на 1 для каждого нового сотрудника.


import de.telran.javastart.Lessons.lesson15.*;

public class Lesson15 {

    public static int[] idManager;

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
        //array[1] = 88;
        //System.out.println(array[2]);
        //System.out.println(array.length);

        AdvancedIntArray advancedArray = new AdvancedIntArray(3);
        advancedArray.set(0, 10);
        advancedArray.set(1, 8);
        advancedArray.set(2, 23);

        advancedArray.set(1, 88);
        System.out.println(advancedArray.get(1));
        System.out.println(advancedArray.size());
        for (int i = 0; i < advancedArray.size(); i++) {
            System.out.print("[");
            System.out.print(advancedArray.get(i));
            System.out.print("]");
            System.out.print(" ");
        }
        System.out.println();

        advancedArray.insert(2, 5);
        for (int i = 0; i < advancedArray.size(); i++) {
            System.out.print("[");
            System.out.print(advancedArray.get(i));
            System.out.print("]");
            System.out.print(" ");
        }
        System.out.println();

        advancedArray.delete(2);
        for (int i = 0; i < advancedArray.size(); i++) {
            System.out.print("[");
            System.out.print(advancedArray.get(i));
            System.out.print("]");
            System.out.print(" ");
        }
        System.out.println();

        System.out.println(advancedArray.contains(88));
        System.out.println("--------------------");
        System.out.println("");
        System.out.println("--------------------");

        Employee misha = new OfficeEmployee("Misha S.", "IBM", 2200, 300);
        System.out.println("Manager ID: " + misha.getId());

        Employee kesha = new OfficeEmployee("Innokenty S.", "KINO",2100, 250);
        System.out.println("Manager ID: " + kesha.getId());

        Employee kolia = new OfficeEmployee("Nikolaj B.", "KINO",2100, 250);
        System.out.println("Manager ID: " + kolia.getId());

        OfficeEmployee dina = new OfficeEmployee("Dina D.", "ORACLE", 2500, 100);
        System.out.println("Manager ID: " + dina.getId());
        Employee dina2 = new OfficeEmployee(/*1,*/ "Dina D.", "ORACLE", 2500, 100);

        System.out.println("Misha's salary: " + misha.getSalary());
        System.out.println("Dina's salary: " + dina.getSalary());
        System.out.println("Dina2's salary: " + dina2.getSalary());

        Manager gennady = new Manager(/*3,*/ "Gennady M.", "DB", 4000, 1.5);
        System.out.println("Gennady's salary: " + gennady.getSalary());

        HourlyEmployee veronika = new HourlyEmployee(/*5,*/ "Veronika P.", "DELL", 2500, 200);
        System.out.println("Veronika's salary: " + veronika.getSalary());

        // ПОЛИМОРФИЗМ - это возможность вызвать метод по ссылке на базовый класс

        dina.introduce();
        //((OfficeEmployee)dina).introduce();
        // ошибка!!! потому что разные дочерние классы ((OfficeEmployee)gennady).introduce();

        dina.setManager(gennady);
        dina.introduce();

    }
}
