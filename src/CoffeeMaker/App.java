package CoffeeMaker;

import CoffeeMaker.CofeeMachineTypes.BlackCoffeeMachine;

import java.util.List;

/**
 * Created by rkrde on 14-01-2017.
 */
public class App {

    public static void main(String[] args) {

        /*
        Choose coffeeMaker and choose its respective Beverage..
         */
        ICoffeeMachine coffeeMachine = new BlackCoffeeMachine();
        List<String> list = coffeeMachine.showBeverages(); //could also be list of beverage !! for more encapsulation
        coffeeMachine.makeCoffee(list.get(1));

    }
}
