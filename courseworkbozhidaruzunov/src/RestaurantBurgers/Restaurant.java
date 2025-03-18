package RestaurantBurgers;

public class Restaurant {
    private static Restaurant instance;
    private String name;

    private Restaurant(String name) {
        this.name = name;
    }

    public static Restaurant getInstance(String name) {
        if (instance == null) {
            instance = new Restaurant(name);
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Ресторант: " + name;
    }
}
