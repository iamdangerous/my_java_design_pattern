package CoffeeMaker.CofeeMachineTypes;

import CoffeeMaker.BeverageType.Americano;
import CoffeeMaker.BeverageType.Cappuccino;
import CoffeeMaker.ICoffeeMachine;

import java.util.ArrayList;

/**
 * Created by rkrde on 14-01-2017.
 */
public class BlackCoffeeMachine implements ICoffeeMachine {

    Americano americano;
    Cappuccino cappuccino;
    public BlackCoffeeMachine(){
        americano = new Americano();
        cappuccino = new Cappuccino();
    }
    @Override
    public void makeCoffee(String beverage) {
        System.out.println("Make "+beverage+" Coffee");
    }

    @Override
    public ArrayList<String> showBeverages() {
        ArrayList<String> list = new ArrayList<>();
        list.add(americano.showName());
        list.add(cappuccino.showName());
        return list;
    }
}
