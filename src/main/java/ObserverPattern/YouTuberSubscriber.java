package ObserverPattern;

public class YouTuberSubscriber implements IObserver{
    private YouTuber subscribed;
    private String stateMessage = "Default Message";

    public YouTuberSubscriber(IObservable subject) {
        this.subscribed = (YouTuber)subject;
    }

    public void update() {
        this.stateMessage = this.subscribed.getStateMessage();
    }

    public String getStateMessage() {
        return this.stateMessage;
    }
}
