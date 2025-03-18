package RestaurantBurgers;

public class RoyalBurger extends Burger {
    public RoyalBurger() {
        description = "Кралски бургер";
    }

    @Override
    public double cost() {
        return 12.99;
    }
}
