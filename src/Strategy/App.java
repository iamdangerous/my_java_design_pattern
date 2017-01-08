package Strategy;

import Strategy.DuckTypes.MallardDuck;
import Strategy.DuckTypes.ModelDuck;
import Strategy.FlyingTypes.FlyWithWings;

/**
 * Created by rkrde on 08-01-2017.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("-----Mallard Duck-----");
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuake();

        System.out.println("-----Model Duck-----");
        ModelDuck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.performQuake();
        modelDuck.setFlyBehavior(new FlyWithWings());
        modelDuck.performFly();
    }
}
