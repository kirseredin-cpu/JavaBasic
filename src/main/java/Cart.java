import java.util.HashMap;
import java.util.Map;

public class Cart {

   private final Map<Product, Integer> products = new HashMap<>();

    public void addProduct (Product product, int quantity) {
        if (quantity<=0) return;
        products.put(product, products.getOrDefault(product, 0) + quantity);
    }
    public double getTotalPrice(){
        double total = 0;
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            total += entry.getKey().getPrice() * entry.getValue();
        }
        return total;
    }


    public int getProductCount() {
        int count = 0;
        for (int quantity : products.values()) {
            count += quantity;
        }
        return count;
    }

    public static void main(String[] args) {
        Product product1 = new Product("Банан", 40);
        Product product2 = new Product("Балалайка", 32);
        Product product3 = new Product("Кефир", 75.4);
        Product product4 = new Product("Мяч", 26.55);

        Cart cart = new Cart();
        cart.addProduct(product1, 2);
        cart.addProduct(product2, 1);
        cart.addProduct(product3, 3);
        cart.addProduct(product1, 8);
        cart.addProduct(product4, 2);


        // Отдельно выводим требуемые значения
        System.out.println("getProductCount(): " + cart.getProductCount());
        System.out.println("getTotalPrice(): " + String.format("%.2f", cart.getTotalPrice()) + "₽");
    }
}

