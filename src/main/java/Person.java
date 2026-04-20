public class Person {
    // Переменные класса
    String firstName;
    String lastName;
    int age;

    // Метод introduce() для вывода информации о человеке
    void introduce() {
        // Склеиваем строки и переменные через оператор +
        System.out.println("Привет, меня зовут " + firstName + " " + lastName + ". Мне " + age + " лет.");
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    // Главный метод — точка входа в программу
    public static void main(String[] args) {
        // Создаём объект класса Person
      //  Person person = new Person();
        Person person2 = new Person("DA", "Ivanov", 20);
        Person person1 = new Person("Dad", "gRe", 55);
        Person person3 = new Person("Ce", "Fe", 1245);



        // Заполняем поля объекта
     //   person.firstName = "Kolyan";
     //   person.lastName = "Box";
     //   person.age = 32;

        // Вызываем метод introduce()
        person1.introduce();
        person2.introduce();
        person3.introduce();
    }
}