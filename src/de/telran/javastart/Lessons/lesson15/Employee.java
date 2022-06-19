package de.telran.javastart.Lessons.lesson15;

public class Employee {
    int id;
    String name;
    String company;
    int baseSalary;

    public static int idManager = 1;
    // public - видно везде
    // без модификатора - видно в пэкедже
    // protected - видно в дочерних классах и в пэкедже
    // private - видно только в самом классе


    public Employee(String name, String company, int baseSalary) {
        this(idManager, name, company, baseSalary);
    }

    public Employee(int id, String name, String company, int baseSalary) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.baseSalary = baseSalary;
        idManager++;
    }

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
