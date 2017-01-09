package ObserverPattern.Type_1;

/**
 * Created by rkrde on 10-01-2017.
 */
public class HeatIndexDisplay implements Observer, DisplayElement {

    float heatIndex;
    Subject weatherData;

    HeatIndexDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {

        heatIndex = temp + 100;
        display();
    }

    @Override
    public void display() {
        System.out.println("Heat index is " + heatIndex);
    }
}
