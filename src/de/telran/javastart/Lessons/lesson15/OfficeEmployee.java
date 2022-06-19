package de.telran.javastart.Lessons.lesson15;

//     Порожденный класс           Супер класс
//     Дочерний класс расширяет    Базовый класс
public class OfficeEmployee extends Employee {
    int monthlyBonus;
    String manager;

    public OfficeEmployee(int id, String name, String company, int baseSalary, int monthlyBonus, String manager) {
        // В конструкторе дочернего класса обязательно нужно вызвать констуктор базового класса
        super(id, name, company, baseSalary);
        this.monthlyBonus = monthlyBonus;
        this.manager = manager;
    }

    // Override - заменять, переезжать, преодолевать
    // анотация @Override нужна, чтобы проверить, что в базовом классве
    // есть функция с таким названием
    @Override
    public int getSalary() {
        return baseSalary + monthlyBonus;
    }

    public int getMonthlyBonus() {
        return monthlyBonus;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    //    public void setManager(Manager) {
//        Manager = manager;
//    }

    public void introduce() {
        System.out.println("Name is: " + getName() + "; " +
                "Company: " + getCompany() + "; " +
                "Bonus: " + getMonthlyBonus() + "; " +
                "Manager: " + getManager());
    }
}
