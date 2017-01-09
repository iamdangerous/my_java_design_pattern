package ObserverPattern.Native;

/**
 * Created by rkrde on 10-01-2017.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(1,1,1);

        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(4,4,3);


    }
}
