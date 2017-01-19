package CoffeeMaker.IngredientTypes;

import CoffeeMaker.IIngredient;

/**
 * Created by rkrde on 14-01-2017.
 */
public class MangoIngredient implements IIngredient {
    @Override
    public void pour() {
        System.out.println("Pouring Mango Ingredient");
    }

    @Override
    public void price() {
        System.out.println("Mango Ingredient price : Rs 30");
    }
}
