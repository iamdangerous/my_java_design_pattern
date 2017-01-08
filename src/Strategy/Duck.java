package Strategy;

import Strategy.DuckBehavior.FlyingBehavior;
import Strategy.DuckBehavior.QuakeBehavior;

/**
 * Created by rkrde on 08-01-2017.
 */
public  abstract class Duck {

    public FlyingBehavior flyingBehavior; //HAS-A relationship
    public QuakeBehavior quakeBehavior;   //HAS-A relationship

    public  abstract void display();

    /*
    The duck object delegates the behavior of flying & quaking to the OBJECT referenced
    by flyingBehavior & quakeBehavior ....
     */
    public void performFly(){
        flyingBehavior.fly();
    }
    public void performQuake(){
        quakeBehavior.quake();
    }
    public void setFlyBehavior(FlyingBehavior fb) {
        flyingBehavior = fb;
    }
    public void setQuackBehavior(QuakeBehavior qb) {
        quakeBehavior = qb;
    }
    void swim()
    {
        System.out.println("All ducks float, even decoys!");
    }

}
