package RestaurantBurgers;

public class BurgeriiteTest {
    public static void main(String[] args) {

        Restaurant restaurant = Restaurant.getInstance("Бургериите");
        System.out.println(restaurant);

        Kitchen kitchen = new Kitchen();

        Cheff cheff = new Cheff("Драган", kitchen);

        Cashier cashier = new Cashier("Ърльо");

        Command order1 = new OrderBurgerCommand(cheff, "кралски", "чеснов");
        Command order2 = new OrderBurgerCommand(cheff, "класически", "кетчуп");
        Command order3 = new OrderBurgerCommand(cheff, "вегетариански", "чеснов", "кетчуп");
        Command order4 = new OrderBurgerCommand(cheff, "класически");

        System.out.println("\n Поръчка 1");
        cashier.takeOrder(order1);

        System.out.println("\n Поръчка 2");
        cashier.takeOrder(order2);

        System.out.println("\nПоръчка 3");
        cashier.takeOrder(order3);

        System.out.println("\nПоръчка 4");
        cashier.takeOrder(order4);
    }
}
