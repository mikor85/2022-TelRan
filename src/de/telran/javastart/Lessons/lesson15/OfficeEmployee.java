package de.telran.javastart.Lessons.lesson15;

//     Порожденный класс           Супер класс
//     Дочерний класс расширяет    Базовый класс
public class OfficeEmployee extends Employee {

    // Поля
    int monthlyBonus;
    private static Manager manager;

    public OfficeEmployee(String name, String company, int baseSalary, int monthlyBonus) {
        super(name, company, baseSalary);
        this.monthlyBonus = monthlyBonus;
    }

    // Override - заменять, переезжать, преодолевать
    // анотация @Override нужна, чтобы проверить, что в базовом классве
    // есть функция с таким названием

    // Геттеры и сеттеры
    @Override
    public int getSalary() {
        return baseSalary + monthlyBonus;
    }

    public int getMonthlyBonus() {
        return monthlyBonus;
    }

    public static Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }


    // Методы
    public void introduce() {
        if (manager == null) {
            System.out.println("ID is: " + getId() + "; " +
                    "Name is: " + getName() + "; " +
                    "Company: " + getCompany() + "; " +
                    "Bonus: " + getMonthlyBonus() + ".");
        } else {
            System.out.println("ID is: " + getId() + "; " +
                    "Name is: " + getName() + "; " +
                    "Company: " + getCompany() + "; " +
                    "Bonus: " + getMonthlyBonus() + "; " +
                    "Manager: " + getManager().getName());
        }
    }
}
