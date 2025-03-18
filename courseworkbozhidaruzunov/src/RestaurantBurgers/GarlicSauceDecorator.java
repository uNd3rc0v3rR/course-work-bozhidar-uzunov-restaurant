package RestaurantBurgers;

public class GarlicSauceDecorator extends BurgerDecorator {
    public GarlicSauceDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + " с чеснов сос";
    }

    @Override
    public double cost() {
        return burger.cost() + 0.99;
    }
}
