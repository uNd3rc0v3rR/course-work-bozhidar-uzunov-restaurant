package RestaurantBurgers;

public class ClassicBurger extends Burger {
    public ClassicBurger() {
        description = "Класически бургер";
    }

    @Override
    public double cost() {
        return 8.99;
    }
}
