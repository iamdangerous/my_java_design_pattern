package Strategy.DuckTypes;

import Strategy.Duck;
import Strategy.FlyingTypes.FlyWithWings;
import Strategy.QuakeTypes.Quake;

/**
 * Created by rkrde on 08-01-2017.
 */
public class MallardDuck extends Duck {

    public MallardDuck(){

    flyingBehavior = new FlyWithWings();
    quakeBehavior = new Quake();
    }

    @Override
    public void display() {
        System.out.println("Display Mallard Duck");
    }
}
