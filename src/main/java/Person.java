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

    // Главный метод — точка входа в программу
    public static void main(String[] args) {
        // Создаём объект класса Person
        Person person = new Person();

        // Заполняем поля объекта
        person.firstName = "Kolyan";
        person.lastName = "Box";
        person.age = 32;

        // Вызываем метод introduce()
        person.introduce();
    }
}