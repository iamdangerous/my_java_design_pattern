package Factory.MyClass;

import Factory.MyInterface.Shape;

/**
 * Created by rkrde on 07-01-2017.
 */
public class FactoryDemo {
    public static void main(String args[]) throws Exception {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape s1 = shapeFactory.getShape(ShapeFactory.CIRCLE);
        s1.draw();
        Shape s2 = shapeFactory.getShape(ShapeFactory.SQUARE);
        s2.draw();


    }
}
