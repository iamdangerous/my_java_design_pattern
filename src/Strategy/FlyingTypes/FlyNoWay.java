package Strategy.FlyingTypes;

import Strategy.DuckBehavior.FlyingBehavior;

/**
 * Created by rkrde on 08-01-2017.
 */
public class FlyNoWay implements FlyingBehavior{
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
