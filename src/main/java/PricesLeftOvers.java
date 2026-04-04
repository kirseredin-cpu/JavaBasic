import java.util.ArrayList;
import java.util.List;

public class PricesLeftOvers {

    public static void main(String[] args) {
        List<Double> prices = new ArrayList<>();
        prices.add(201.44);
        prices.add(23.54);
        prices.add(367.31);
        prices.add(2.64);
        prices.add(0.5);
        double budget = 1000.0;

        double totalSpent = 0.0;
        int count = 0;
        int index = 0;

        while (index < prices.size() && totalSpent + prices.get(index) <= budget) {
            totalSpent += prices.get(index);
            count++;
            index++;
        }

        double remaining = budget - totalSpent;
        int notBought = prices.size() - count;

        System.out.println("Куплено " +  count + " товара на сумму " + totalSpent);
        System.out.println("Остаток бюджета " + remaining);
        System.out.println("Не Куплено " +  notBought + " товара");
    }
}