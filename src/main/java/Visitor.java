public class Visitor {

    static private int totalVisitors = 0;

    public Visitor() {
        totalVisitors++;
    }

    public static int getTotalVisitors() {
        return totalVisitors;
    }

    public static void main(String[] args) {
        Visitor visitor1 = new Visitor();
        System.out.println(getTotalVisitors());
        Visitor visitor2 = new Visitor();
        System.out.println(getTotalVisitors());
        Visitor visitor3 = new Visitor();
        System.out.println(getTotalVisitors());
        Visitor visitor4 = new Visitor();
        System.out.println(getTotalVisitors());
        Visitor visitor5 = new Visitor();
        System.out.println(getTotalVisitors());
    }
    /*
     * Почему значение одинаковое, если вызвать getTotalVisitors() через любой из пяти объектов?
     * Потому что totalVisitors объявлена со словом static. Статическая переменная принадлежит
     * не конкретному экземпляру (v1, v2...v5), а самому классу Visitor и существует в памяти
     * в единственном экземпляре. Все объекты работают с одной и той же ячейкой памяти, поэтому
     * вызов геттера через любой объект (или через имя класса) всегда возвращает единое,
     * общее для всех состояние счётчика.
     */
}
