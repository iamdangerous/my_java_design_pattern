package CoffeeMaker.BeverageType;

import CoffeeMaker.IBeverage;

/**
 * Created by rkrde on 14-01-2017.
 */
public class Espresso implements IBeverage {
    private final String name = Espresso.class.getSimpleName();
    private final static Espresso espresso = new Espresso();

    public Espresso(){}
    @Override
    public void mixIngredients() {
        System.out.println("Mix Ingredients for :"+name);
    }

    @Override
    public String showName() {
        return name;
    }

//    @Override
//    public static IBeverage getInstance() {
//        return espresso;
//    }
}
