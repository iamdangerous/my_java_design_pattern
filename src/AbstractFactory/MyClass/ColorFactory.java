package AbstractFactory.MyClass;

import AbstractFactory.MyInterface.Color;
import AbstractFactory.MyInterface.Shape;

/**
 * Created by rkrde on 08-01-2017.
 */
public class ColorFactory extends AbstractShopFactory {

    @Override
    Color getColor(int num) {
        switch (num)
        {
            case COLOR_RED: return new RedColor();
            case COLOR_BLUE: return new BlueColor();
        }
        return null;
    }

    @Override
    Shape getShape(int num) {
        return null;
    }
}
