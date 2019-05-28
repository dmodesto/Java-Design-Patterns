package ObserverPattern;

public interface IObservable {
    void addSubscriber(IObserver o);
    void removeSubscriber(IObserver o);
    void notifySubscribers();
}
