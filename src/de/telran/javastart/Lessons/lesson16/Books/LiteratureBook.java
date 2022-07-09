package de.telran.javastart.Lessons.lesson16.Books;

public class LiteratureBook extends Book {
    // этот класс наследует Book
    // в calculatePrice() добавить к цене книги 10

    public static void hello() {
        System.out.println("Hello from LiteratureBook");
    }

        // Наследование = extends
    // в java только одинарное наследование, то есть один дочерний класс может быть потомком только одного базового класса
    // можно переопределять методы из родительского класса,
    // при этом реализация родительских методов доступна через ссылку super на родительский класс.
    // Статические методы не могут переопределяться.


    @Override
    public boolean isAlibris() {
        return false;
    }

    public LiteratureBook(int id, String title, String author, double price) {
        super(id, title, author, price);
    }

    @Override  // пересчет стоимости, добавляем 10
    public double calculatePrice() {
        return super.calculatePrice() + 10;
    }
}
