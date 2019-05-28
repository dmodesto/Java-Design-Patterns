package ObserverPattern;

import java.util.LinkedList;
import java.util.List;

public class YouTuber implements IObservable {

    private List<IObserver> observerList = new LinkedList<IObserver>();
    private String stateMessage;

    public void addSubscriber(IObserver observer) {
        if (observerList.contains(observer)) {
            return;
        }
        observerList.add(observer);
    }

    public void removeSubscriber(IObserver observer) {
        if(observerList.contains(observer)) {
            observerList.remove(observer);
        }
    }

    public void notifySubscribers() {
        for (IObserver sub : observerList) {
            sub.update();
        }
    }

    public void setStatusMessage(String stateMessage) {
        this.stateMessage = stateMessage;
        notifySubscribers();
    }

    public String getStateMessage() {
        return this.stateMessage;
    }
}
