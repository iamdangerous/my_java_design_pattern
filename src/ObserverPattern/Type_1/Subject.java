package ObserverPattern.Type_1;

/**
 * Created by rkrde on 10-01-2017.
 */
public interface Subject {
    void registerObserver(Observer o);
    void unRegisterObserver(Observer o);
    void notifyObserver();

}
