package RestaurantBurgers;

public class VegetarianBurger extends Burger {
    public VegetarianBurger() {
        description = "Вегетариански бургер";
    }

    @Override
    public double cost() {
        return 7.99;
    }
}
