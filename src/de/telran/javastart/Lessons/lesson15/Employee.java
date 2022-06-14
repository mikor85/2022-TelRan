package de.telran.javastart.Lessons.lesson15;

public class Employee {
    int id;
    String name;
    String company;
    int baseSalary;

    // public - видно везде
    // без модификатора - видно в пэкедже
    // protected - видно в дочерних классах и в пэкедже
    // private - видно только в самом классе

    // функция будет считать зарплату исходя из бонусов, стоимости часа, коэффициентов и т.д.
    public int getSalary()
    {
        return baseSalary;
    }

    public Employee(int id, String name, String company, int baseSalary) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.baseSalary = baseSalary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public int getBaseSalary() {
        return baseSalary;
    }
}
