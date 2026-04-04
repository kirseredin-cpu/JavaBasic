public class ShoppingCart {

    public static void main(String[] args) {
        String[] items = {"Кроссовки", "Футболка", "Рюкзак", "Джинсы", "Носки"};
        double[] prices = {199.0, 430.0, 21.0, 8999.0, 1883.0};
        double budget = 50900.0;

        //Вывести список товаров с ценами
        System.out.println("Корзина:");
        for (int i = 0; i < items.length; i++) {
            System.out.println("Продукт: " + items[i] + ", цена - " + prices[i]);
        }

        //Вывести сумму корзины
        double total = 0;

        for (double price : prices) {
            System.out.println("Всего:" + total);
            System.out.println("Тут прибавляем:" + price);
            total += price;
        }

        //  for (int i = 0; i < items.length; i++) {
        //      System.out.println("Тут прибавляем:" + total);
        //       System.out.println("Тут прибавляем:" + prices[i]);
        //      total += prices[i];
        //  }
        System.out.println("Общая сумма корзины: " + total);


        //Задача 3: Есть ли деньги
        System.out.println("Бюджет: " + budget);

        if (budget > total) {
            System.out.println("Бюджет еще есть! Остаток: " + (budget - total));
        } else if (budget < total) {
            System.out.println("Бюджет нет! Недостаточно: " + (total - budget));
        }
    }
}