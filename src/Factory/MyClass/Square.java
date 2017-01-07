package Factory.MyClass;

import Factory.MyInterface.Shape;

/**
 * Created by rkrde on 07-01-2017.
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("This is Square");
    }
}
