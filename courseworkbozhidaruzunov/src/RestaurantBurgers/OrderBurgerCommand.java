package RestaurantBurgers;

public class OrderBurgerCommand implements Command {
    private Cheff cheff;
    private String burgerType;
    private String[] sauces;

    public OrderBurgerCommand(Cheff cheff, String burgerType, String... sauces) {
        this.cheff = cheff;
        this.burgerType = burgerType;
        this.sauces = sauces;
    }

    @Override
    public void execute() {
        Burger burger = cheff.cookBurger(burgerType);

        for (String sauce : sauces) {
            if (sauce.equals("чеснов")) {
                burger = new GarlicSauceDecorator(burger);
            } else if (sauce.equals("кетчуп")) {
                burger = new KetchupDecorator(burger);
            }
        }

        System.out.println("Поръчка изпълнена: " + burger.getDescription() + ", Цена: " + burger.cost() + " лв.");
    }
}
