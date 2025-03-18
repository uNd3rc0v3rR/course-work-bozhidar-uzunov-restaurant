package RestaurantBurgers;

public abstract class Burger {
    protected String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
