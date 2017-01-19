package CoffeeMaker.IngredientTypes;

import CoffeeMaker.IIngredient;

/**
 * Created by rkrde on 14-01-2017.
 */
public class AppleIngredient implements IIngredient {
    @Override
    public void pour() {
        System.out.println("Pouring Apple Ingredient");
    }

    @Override
    public void price() {
        System.out.println("Apple Ingredient price : Rs 20");
    }
}
