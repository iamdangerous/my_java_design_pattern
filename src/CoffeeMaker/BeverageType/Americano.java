package CoffeeMaker.BeverageType;

import CoffeeMaker.IBeverage;

/**
 * Created by rkrde on 14-01-2017.
 */
public class Americano implements IBeverage {
    private final String name = Americano.class.getSimpleName();
    private final static Americano americano = new Americano();

    public Americano() {

    }

    @Override
    public void mixIngredients() {
        System.out.println("Mix Ingredients for :" + name);
    }

    @Override
    public String showName() {
        return name;
    }

//    @Override
//    public IBeverage getInstance() {
//        return americano;
//    }

//    public static IBeverage getInstance() {
//        return americano;
//    }

}
