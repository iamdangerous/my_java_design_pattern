package AbstractFactory.MyClass;

import AbstractFactory.MyInterface.Color;
import AbstractFactory.MyInterface.Shape;

/**
 * Created by rkrde on 08-01-2017.
 */
public abstract class AbstractShopFactory {
    static final int COLOR_RED  = 0;
    static final int COLOR_BLUE  = 1;
    static final int SHAPE_CIRCULAR  = 2;
    static final int SHAPE_SQUARE  = 3;

    static final int COLOR_FACTORY  = 4;
    static final int SHAPE_FACTORY  = 5;


    abstract Color getColor(int num);
    abstract Shape getShape(int num);
}
