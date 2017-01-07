package AbstractFactory.MyClass;

import AbstractFactory.MyInterface.Color;

/**
 * Created by rkrde on 08-01-2017.
 */
public class BlueColor implements Color{
    @Override
    public void fill() {
        System.out.println("Blue Color");
    }
    public void abc(){
        System.out.println("Blue abc");
    }
}
