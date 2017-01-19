package CoffeeMaker;

import java.util.ArrayList;

/**
 * Created by rkrde on 14-01-2017.
 */
public interface ICoffeeMachine {
    void makeCoffee(String Beverage);
    ArrayList<String> showBeverages();
}
