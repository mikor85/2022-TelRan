package de.telran.javastart.Lessons;

public class Lesson14 {
    // Статическе переменные и методы класса описывают класс, а не какой-то
    // конкретный объект этого класса.
    // Таким образом, статические переменные и методы принадлежат классу в целом
    // а не какому-то конкретному объекту (эксземпляру, instance).
    // объект == экземпляр == instance

    public static void main(String[] args) {
        Lesson14 lesson14 = new Lesson14();
        lesson14.max.introduce();

        HomoSapiens katya = new HomoSapiens("Katya", "Ivanova", 20);
        katya.introduce();

        HomoSapiens vasya = new HomoSapiens("Vasya", "", 30);
        vasya.introduce();
        // vasya.lastName = "Pivovarov";
        System.out.println(vasya.getLastName());
        vasya.setLastName("Petrov");

        System.out.println(HomoSapiens.numberOfHumans);
        System.out.println(HomoSapiens.averageAge);

        katya.die();
        System.out.println(HomoSapiens.numberOfHumans);
        System.out.println(HomoSapiens.averageAge);
    }

    HomoSapiens max = new HomoSapiens("Max", "Kotkov", 40);


}

class HomoSapiens {

    public static int numberOfHumans = 0;

    public static double averageAge = 0;

    public static boolean isAlive = false;

    String firstName;
    private String lastName;
    int age;

    public String getLastName() {
        return lastName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Напишите в классе HomoSapiens метод void die() - должен уменьшать количество людей
    // в переменной numberOfHumans и изменять средний возраст в переменной averageAge.
    void die() {
        averageAge = (averageAge * numberOfHumans - age) / (--numberOfHumans);
    }

    public HomoSapiens() {
        this("", "", 0);
    }

    public HomoSapiens(String firstName, String lastName) {
        this(firstName, lastName, 0);
    }

    public HomoSapiens(String firstName, String lastName, int age) {
        //this.firstName = firstName;
        //this.lastName = lastName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        // averageAge = (averageAge * numberOfHumans + age)/(numberOfHumans + 1);
        // numberOfHumans++;
        averageAge = (averageAge * numberOfHumans + age) / (++numberOfHumans);

    }

    public void introduce() {
        if (isAlive) {
            System.out.println("My name is " + firstName + " " + lastName + ". I'm " + age + " year old.");
        } else System.out.println("RIP");
    }
}
