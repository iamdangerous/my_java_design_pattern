package AbstractFactory.MyClass;

import AbstractFactory.MyInterface.Color;
import AbstractFactory.MyInterface.Shape;

/**
 * Created by rkrde on 08-01-2017.
 */
public class App {
    public static void main(String[] args) {
        //COLOR
        AbstractShopFactory abstractShopFactoryColor = FactoryProducer.getFactory(AbstractShopFactory.COLOR_FACTORY);
        /*
        NULL
        Shape shape = abstractShopFactory.getShape(AbstractShopFactory.SHAPE_CIRCULAR);
        shape.draw();
         */

        Color color = abstractShopFactoryColor.getColor(AbstractShopFactory.COLOR_BLUE);
        color.fill();
        BlueColor blueColor = (BlueColor)color;
        blueColor.abc();

        ColorFactory cf = (ColorFactory)abstractShopFactoryColor;
        cf.getColor(AbstractShopFactory.COLOR_RED).fill();

        //SHAPE
        AbstractShopFactory abstractShopFactoryShape = FactoryProducer.getFactory(AbstractShopFactory.SHAPE_FACTORY);

        /*
        NULL
        Color color = abstractShopFactoryColor.getColor(AbstractShopFactory.COLOR_BLUE);
        color.fill();
         */

        Shape shape = abstractShopFactoryShape.getShape(AbstractShopFactory.SHAPE_CIRCULAR);
        shape.draw();
    }
}
