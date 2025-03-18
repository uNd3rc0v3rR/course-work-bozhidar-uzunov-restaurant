package RestaurantBurgers;

public class Kitchen {
    public Burger createBurger(String type) {
        Burger burger = null;

        if (type.equalsIgnoreCase("кралски")) {
            burger = new RoyalBurger();
        } else if (type.equalsIgnoreCase("класически")) {
            burger = new ClassicBurger();
        } else if (type.equalsIgnoreCase("вегетариански")) {
            burger = new VegetarianBurger();
        }

        return burger;
    }
}
