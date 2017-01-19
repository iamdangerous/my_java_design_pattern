package DecoratorPattern.example_1;

/**
 * Created by rkrde on 20-01-2017.
 */
public abstract class Beverage {
    String description="Unknown";
    public final static int SIZE_MEDIUM = 0;
    public final static int SIZE_LARGE = 1;
    public final static int SIZE_SMALL = 2;

    public String getDescription(){
        return description;
    }
    abstract int cost();
//    abstract int getSize();


}
