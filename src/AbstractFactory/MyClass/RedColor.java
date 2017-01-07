package AbstractFactory.MyClass;

import AbstractFactory.MyInterface.Color;

/**
 * Created by rkrde on 08-01-2017.
 */
public class RedColor implements Color{
    @Override
    public void fill() {
        System.out.println("Red Color");
    }
}
