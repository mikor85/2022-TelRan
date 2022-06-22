package de.telran.javastart.Lessons.lesson15;

public class HourlyEmployee extends Employee{
    int monthlyHours;

    public HourlyEmployee(/*int id,*/ String name, String company, int baseSalary, int monthlyHours) {
        super(/*id,*/ name, company, baseSalary);
        this.monthlyHours = monthlyHours;
    }

    @Override
    public int getSalary() {
        return baseSalary/180*monthlyHours;
    }
}
