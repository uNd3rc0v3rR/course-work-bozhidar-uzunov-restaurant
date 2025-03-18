package RestaurantBurgers;

public abstract class BurgerDecorator extends Burger {
    protected Burger burger;

    public BurgerDecorator(Burger burger) {
        this.burger = burger;
    }

    public abstract String getDescription();
}

