package RestaurantBurgers;

public class Cheff {
    private String name;
    private Kitchen kitchen;

    public Cheff(String name, Kitchen kitchen) {
        this.name = name;
        this.kitchen = kitchen;
    }

    public Burger cookBurger(String type) {
        System.out.println("Готвачът " + name + " ви приготвя " + type + " бургера от кухнята на Бургериите.");
        return kitchen.createBurger(type);
    }
}
