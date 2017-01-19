package DecoratorPattern.example_1;

/**
 * Created by rkrde on 20-01-2017.
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;
    public Milk(Beverage beverage){this.beverage = beverage;}
    @Override
    public String getDescription() {
        return beverage.getDescription() + " with Milk";
    }

    @Override
    int cost() {
        return beverage.cost()+50;
    }
}
