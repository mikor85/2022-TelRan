package de.telran.javastart.Lessons.lesson15;

// добавить ему коэффициент double
// расчитать зарплату как baseSalary * coeff
// породить его от Employee
public class Manager extends Employee{
    double coeff;

    public Manager(int id, String name, String company, int baseSalary, double coeff) {
        super(id, name, company, baseSalary);
        this.coeff = coeff;
    }

    @Override
    public int getSalary() {
        // через префикс super можно вызывать определенные функции в базовом классе
        // return (int) (super.getSalary() * coeff);
        return (int) (super.getSalary() * coeff);
    }
}
