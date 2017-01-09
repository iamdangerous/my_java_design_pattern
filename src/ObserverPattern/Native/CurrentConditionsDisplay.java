package ObserverPattern.Native;

import java.util.Observable;
import java.util.Observer;
/**
 * Created by rkrde on 10-01-2017.
 */


public class CurrentConditionsDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    Observable observable;
    public CurrentConditionsDisplay(Observable observable){
        this.observable = observable;
        this.observable.addObserver(this);
    }
    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }


}
