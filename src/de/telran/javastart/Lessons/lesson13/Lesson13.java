package de.telran.javastart.Lessons.lesson13;

public class Lesson13 {

    // Класс - объединение чего-либо по характерным признакам
    // Своего рода шаблон для описаня своих представителей
    // Класс в Java содержит описание свойств и действий
    // Представитель класса называется - ЭКЗЕМПЛЯР, ENTITY
    // Свойство класса - поле
    // Действие класса - метод либо функция
    // Название класса начинается с заглавной буквы

    // Инкапсуляция - размещение (оганизация кода) полей и методов, связанных друг с другом в одном методе
    // Есть возможность скрыть поля и методы от вызова из вне, из-за пределов класса или пакета

    public static void main(String[] args) {

        Human vasya = new Human("Vasya", "Samokhvalov", 27);  // создание нового класса Human
        // Human() - конструктор / constructor
//        vasya.name = "Vasya";
//        vasya.lastName = "Samokhvalov";
//        vasya.age = 27;
//        vasya.name = "Petya";

        vasya.introduce();

        Human petya = vasya;
        petya.introduce();
    }
}

class Human {  // package private
    String name;
    String lastName;
    int age;

    Human(String f, String l, int a) {
        // Конструктор нужен для того, чтобы проинициализировать поля класса
        name = f;
        lastName = l;
        age = a;
    }

    void introduce() {
        System.out.println("My name is " + name + " " + lastName + ". I'm " + age + " years old.");
    }
}
