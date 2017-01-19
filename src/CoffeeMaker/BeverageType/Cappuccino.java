package CoffeeMaker.BeverageType;

import CoffeeMaker.IBeverage;

/**
 * Created by rkrde on 14-01-2017.
 */
public class Cappuccino implements IBeverage {


    private final String name = Cappuccino.class.getSimpleName();
    private final static Cappuccino cappuccino = new Cappuccino();
    public Cappuccino(){}
    @Override
    public void mixIngredients() {
        System.out.println("Mix Ingredients for: "+ name);
    }

    @Override
    public String showName() {
        return name;
    }

//    @Override
//    public static IBeverage getInstance() {
//        return cappuccino;
//    }
}
