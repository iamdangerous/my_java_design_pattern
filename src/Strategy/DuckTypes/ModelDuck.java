package Strategy.DuckTypes;

import Strategy.Duck;
import Strategy.FlyingTypes.FlyNoWay;
import Strategy.QuakeTypes.MuteQuack;

/**
 * Created by rkrde on 08-01-2017.
 */
public class ModelDuck extends Duck {

    public ModelDuck(){
        flyingBehavior = new FlyNoWay();
        quakeBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I am a model duck");
    }
}
