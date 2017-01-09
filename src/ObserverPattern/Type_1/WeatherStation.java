package ObserverPattern.Type_1;

/**
 * Created by rkrde on 10-01-2017.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(1,1,1);
        weatherData.setMeasurements(4,4,3);

        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        weatherData.setMeasurements(1,1,1);
        weatherData.setMeasurements(4,4,3);


    }
}
