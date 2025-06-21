package Week1.DesignPatterns.ObserverPattern.Code;

public interface Stock {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}