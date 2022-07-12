package de.telran.javastart.Lessons.lesson18.Auto;

public class Auto extends Object{
    private String maker;
    private int year;
    private String color;

    // Конструктор
    public Auto(String maker, int year, String color) {
        this.maker = maker;
        this.year = year;
        this.color = color;
    }

    // Геттеры и сеттеры
    public String getMaker() {
        return maker;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Методы

    @Override
    public String toString() {
        return " " + maker + " " + year + " " + color;
    }

    @Override
    // Эквивалентность по содержанию
    public boolean equals(Object o){
        if (!(o instanceof Auto)){
            return false;
        }
        Auto a = (Auto) o;
        return getMaker().equals(a.getMaker()) && getYear() == a.getYear() && getColor().equals(a.getColor());
    }
}
