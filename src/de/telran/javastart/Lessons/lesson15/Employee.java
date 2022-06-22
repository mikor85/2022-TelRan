package de.telran.javastart.Lessons.lesson15;

abstract public class Employee {

    // Поля
    int id;
    String name;
    String company;
    int baseSalary;

    private static int idManager = 1;

    // public - видно везде
    // без модификатора - видно в пэкедже
    // protected - видно в дочерних классах и в пэкедже
    // private - видно только в самом классе

    // Конструктор
    public Employee(String name, String company, int baseSalary) {
        this.id = idManager++;
        this.name = name;
        this.company = company;
        this.baseSalary = baseSalary;
    }

    // Геттеры и сеттеры

    // функция будет считать зарплату исходя из бонусов, стоимости часа, коэффициентов и т.д.
    public int getSalary() {
        return baseSalary;
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

    public void setId(int id) {
        this.id = id;
    }

}
