import java.util.ArrayList;
import java.util.List;

public class Prices{

    public static void main(String[] args) {
        List<Double> prices = new ArrayList<>();
        prices.add(201.44);
        prices.add(23.54);
        prices.add(367.31);
        prices.add(2.64);
        prices.add(0.5);

    /*    for (int i = 0; i < prices.size(); i++){
            System.out.println((i+1) + ". " + prices.get(i));
        }*/

        double doubleBudget = 300;
        double total = 0;

        for (double price : prices) {
            total += price;

        }

        System.out.println("Всего:" + total);

        if (doubleBudget > total) {
            System.out.println("Бюджет еще есть! Остаток: " + (doubleBudget - total));
        } else if (doubleBudget < total) {
            System.out.println("Бюджет нет! Недостаточно: " + (total - doubleBudget));
        }


    }
}