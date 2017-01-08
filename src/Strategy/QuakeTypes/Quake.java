package Strategy.QuakeTypes;

import Strategy.DuckBehavior.QuakeBehavior;

/**
 * Created by rkrde on 08-01-2017.
 */
public class Quake implements QuakeBehavior {
    @Override
    public void quake() {
        System.out.println("I can Quack");
    }
}
