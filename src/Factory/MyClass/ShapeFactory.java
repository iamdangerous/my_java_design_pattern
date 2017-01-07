package Factory.MyClass;

import Factory.MyInterface.Shape;

/**
 * Created by rkrde on 07-01-2017.
 */
public class ShapeFactory {

    public static final int CIRCLE = 0;
    public static final int SQUARE = 1;

    public Shape getShape(int type) throws Exception {
        switch (type)
        {
            case CIRCLE: return new Circle();
            case SQUARE: return new Square();
            default:
                throw new Exception("Invalid Type");
        }
    }
}
