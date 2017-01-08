package Strategy.FlyingTypes;

import Strategy.DuckBehavior.FlyingBehavior;

/**
 * Created by rkrde on 08-01-2017.
 */
public class FlyWithWings implements FlyingBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying with wings!!!");
    }
}
