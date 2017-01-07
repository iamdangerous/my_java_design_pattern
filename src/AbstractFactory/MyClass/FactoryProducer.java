package AbstractFactory.MyClass;

/**
 * Created by rkrde on 08-01-2017.
 */
public class FactoryProducer {
    public static AbstractShopFactory getFactory(int num){
        switch (num){
            case AbstractShopFactory.COLOR_FACTORY : return new ColorFactory();
            case AbstractShopFactory.SHAPE_FACTORY : return new ShapeFactory();
        }
        return null;
    }
}
