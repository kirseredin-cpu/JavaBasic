import java.util.ArrayList;
import java.util.List;

public class Fruits{

    public static void main(String[] args) {
            List<String> fruits = new ArrayList<>();
        fruits.add("Манго");
        fruits.add("Банан");
        fruits.add("Ягода");
        fruits.add("Тыква");
        fruits.add("Шар");

        for (int i = 0; i < fruits.size(); i++){
            System.out.println((i+1) + ". " + fruits.get(i));
        }
    }
}