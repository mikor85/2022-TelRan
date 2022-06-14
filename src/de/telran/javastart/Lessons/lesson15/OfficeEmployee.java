package de.telran.javastart.Lessons.lesson15;

//     Порожденный класс           Супер класс
//     Дочерний класс расширяет    Базовый класс
public class OfficeEmployee extends Employee {
    int monthlyBonus;

    public OfficeEmployee(int id, String name, String company, int baseSalary, int monthlyBonus) {
        // В конструкторе дочернего класса обязательно нужно вызвать констуктор базового класса
        super(id, name, company, baseSalary);
        this.monthlyBonus = monthlyBonus;
    }

    // Override - заменять, переезжать, преодолевать
    // анотация @Override нужна, чтобы проверить, что в базовом классве
    // есть функция с таким названием
    @Override
    public int getSalary()
    {
        return baseSalary + monthlyBonus;
    }


    public int getMonthlyBonus()
    {
        return monthlyBonus;
    }

    public void introduce()
    {
        System.out.println("Name is: " + getName() + " company: " + getCompany() + " bonus: " + getMonthlyBonus());
        name = "Irina P.";
    }
}
