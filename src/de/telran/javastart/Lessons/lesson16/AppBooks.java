package de.telran.javastart.Lessons.lesson16;

public class AppBooks {
    public static void main(String[] args) {
        //Book book = new Book(1, "Малая земля", "Брежнев", 12.33);

        LiteratureBook harry = new LiteratureBook(2, "Гарри гафиг", "Роулингс", 33.12);

        Bestseller jaws = new Bestseller(3, "Jews", "Saimon", 15, 1.2);

        //describeBook(jaws);

        Book[] books = {/*book,*/ harry, jaws};

        harry.hello();
        jaws.hello();

        LiteratureBook j = jaws;
        j.hello();  // j - Bestseller
        LiteratureBook.hello();

        Book book = harry;

        for (Book b: books) {
            describeBook(b);
        }
        // Полиморфизм  - это возможность вызвать один и тот же метод по ссылке на базовый класс
    }

    public static void describeBook(Book book) {
        System.out.println("Id: " + book.getId() + "; " +
                "Author: " + book.getAuthor() + "; " +
                "Price: " + book.calculatePrice() + ".");
    }

    int[] a = new int[] {1,2,3};
    MyArrayList list = new MyArrayList(a);
}
