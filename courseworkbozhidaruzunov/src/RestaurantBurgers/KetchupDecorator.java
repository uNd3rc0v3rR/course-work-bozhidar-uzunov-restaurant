package RestaurantBurgers;

public class KetchupDecorator extends BurgerDecorator {
    public KetchupDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + " с кетчуп";
    }

    @Override
    public double cost() {
        return burger.cost() + 0.59;
    }
}
