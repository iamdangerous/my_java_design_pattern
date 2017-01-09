package ObserverPattern.Type_1;

import java.util.ArrayList;

/**
 * Created by rkrde on 10-01-2017.
 */
public class WeatherData implements Subject {

    ArrayList observers;
    float temp,pressure,humidity;

    public WeatherData() {
        this.observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void unRegisterObserver(Observer o) {
        int index = observers.indexOf(o);
        if(index>=0){
            observers.remove(index);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i=0;i<observers.size();++i){
            Observer observer = (Observer) observers.get(i);
            observer.update(temp,humidity,pressure);
        }
    }

    public void measurementsChanged() {
        notifyObserver();
    }
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temp = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
