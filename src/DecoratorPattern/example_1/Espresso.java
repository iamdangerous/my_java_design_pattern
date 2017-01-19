package DecoratorPattern.example_1;

/**
 * Created by rkrde on 20-01-2017.
 */
public class Espresso extends Beverage {

   public Espresso(){
       description = "Espresso";
   }
    @Override
    int cost() {
        return 20;
    }


}
