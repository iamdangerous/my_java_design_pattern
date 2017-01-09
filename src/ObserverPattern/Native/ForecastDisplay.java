package ObserverPattern.Native;

import java.util.*;

/**
 * Created by rkrde on 10-01-2017.
 */
public class ForecastDisplay implements java.util.Observer,DisplayElement{

    private float currentPressure = 29.2f;
    private float lastPressure;
    Observable observable ;
    public ForecastDisplay (Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }


    @Override
    public void display() {
        System.out.println("Last Pressure: " + lastPressure
                + ",Current Pressure: " + currentPressure);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)obs;
            lastPressure  = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }
}
