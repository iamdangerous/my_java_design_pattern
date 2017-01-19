package DecoratorPattern.example_1;

/**
 * Created by rkrde on 20-01-2017.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;
    public Mocha(Beverage beverage){this.beverage = beverage;}
    @Override
    public String getDescription() {
        return beverage.getDescription() + " with Mocha";
    }

    @Override
    int cost() {
        return beverage.cost()+40;
    }
}
