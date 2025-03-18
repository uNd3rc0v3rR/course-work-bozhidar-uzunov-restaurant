package RestaurantBurgers;

public class Cashier {
    private String name;

    public Cashier(String name) {
        this.name = name;
    }

    public void takeOrder(Command command) {
        System.out.println("Касиерът " + name + " ви прие поръчката.");
        command.execute();
    }
}
