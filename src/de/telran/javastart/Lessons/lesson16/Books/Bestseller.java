package de.telran.javastart.Lessons.lesson16.Books;

public class Bestseller extends LiteratureBook {
    // он расширяет LiteratureBook
    // дополнительное поле double coeff
    // расширяет calculatePrice умножая цену на coeff

    // поля класса
    private double coef;

    // конструктор
    public Bestseller(int id, String title, String author, double price, double coef) {
        super(id, title, author, price);
        this.coef = coef;
    }

    // Getter and Setter
    public double getCoef() {
        return coef;
    }

    public void setCoef(double coef) {
        this.coef = coef;
    }

    // методы класса
    @Override  // пересчет стоимости с учетом коэффициента
    public double calculatePrice() {
        return super.calculatePrice() * coef;
    }

    public static void hello()
    {
        System.out.println("Hello from Bestseller");
    }


}
