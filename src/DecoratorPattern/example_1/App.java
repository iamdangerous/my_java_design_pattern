package DecoratorPattern.example_1;

/**
 * Created by rkrde on 20-01-2017.
 */
public class App {
    public static void main(String[] args) {

        Beverage b1 = new Espresso();
        System.out.println(b1.getDescription());

        Beverage b2 = new Espresso();
        b2 = new Mocha(b2);
        b2 = new Milk(b2);
        System.out.println(b2.getDescription());
        System.out.println(b2.cost());

    }
}
