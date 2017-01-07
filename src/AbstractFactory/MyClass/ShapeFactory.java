package AbstractFactory.MyClass;

import AbstractFactory.MyInterface.Color;
import AbstractFactory.MyInterface.Shape;

/**
 * Created by rkrde on 08-01-2017.
 */
public class ShapeFactory extends AbstractShopFactory {

    @Override
    Color getColor(int num) {
        return null;
    }

    @Override
    Shape getShape(int num) {
        switch (num)
        {
            case SHAPE_CIRCULAR: return new CircularShape();
            case SHAPE_SQUARE: return new SquareShape();
        }
        return null;
    }
}
