package CoffeeMaker.CofeeMachineTypes;

import CoffeeMaker.ICoffeeMachine;

import java.util.ArrayList;

/**
 * Created by rkrde on 14-01-2017.
 */
public class BrownCoffeeMachine implements ICoffeeMachine {
    @Override
    public void makeCoffee(String beverage) {
        System.out.println("Make "+beverage+" Coffee");
    }

    @Override
    public ArrayList<String> showBeverages() {
        return null;
    }
}
