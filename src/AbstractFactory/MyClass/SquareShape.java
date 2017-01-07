package AbstractFactory.MyClass;

import AbstractFactory.MyInterface.Shape;

/**
 * Created by rkrde on 08-01-2017.
 */
public class SquareShape implements Shape {
    @Override
    public void draw() {
        System.out.println("Square Shape");
    }
}
