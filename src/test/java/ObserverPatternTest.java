import ObserverPattern.YouTuber;
import ObserverPattern.YouTuberSubscriber;
import org.junit.Assert;
import org.junit.Test;

public class ObserverPatternTest {

    @Test
    public void addSubscriber() {
        YouTuber youTuber = new YouTuber();
        YouTuberSubscriber ytSub01 = new YouTuberSubscriber(youTuber);
        Assert.assertNotNull(youTuber);
    }

    @Test
    public void addDuplicateSubscriber() {
        YouTuber youTuber = new YouTuber();
        YouTuberSubscriber ytSub01 = new YouTuberSubscriber(youTuber);
        youTuber.addSubscriber(ytSub01);
        youTuber.addSubscriber(ytSub01);

        youTuber.setStatusMessage("Status 01");

        Assert.assertNotEquals("Default Message", ytSub01.getStateMessage());
        Assert.assertEquals("Status 01", ytSub01.getStateMessage());
    }

    @Test
    public void testMessageFromSubscriber() {
        YouTuber youTuber = new YouTuber();
        YouTuberSubscriber ytSub01 = new YouTuberSubscriber(youTuber);
        youTuber.addSubscriber(ytSub01);

        youTuber.setStatusMessage("Status 01");

        Assert.assertNotEquals("Default Message", ytSub01.getStateMessage());
        Assert.assertEquals("Status 01", ytSub01.getStateMessage());
    }

    @Test
    public void testMessageFromMultipleSubscribers() {
        YouTuber youTuber = new YouTuber();
        YouTuberSubscriber ytSub01 = new YouTuberSubscriber(youTuber);
        YouTuberSubscriber ytSub02 = new YouTuberSubscriber(youTuber);
        YouTuberSubscriber ytSub03 = new YouTuberSubscriber(youTuber);
        youTuber.addSubscriber(ytSub01);
        youTuber.addSubscriber(ytSub02);
        youTuber.addSubscriber(ytSub03);

        youTuber.setStatusMessage("Status 02");

        Assert.assertEquals("Status 02", ytSub01.getStateMessage());
        Assert.assertEquals("Status 02", ytSub02.getStateMessage());
        Assert.assertEquals("Status 02", ytSub03.getStateMessage());
    }

    @Test
    public void removeSubscriber() {
        YouTuber youTuber = new YouTuber();
        YouTuberSubscriber ytSub01 = new YouTuberSubscriber(youTuber);
        YouTuberSubscriber ytSub02 = new YouTuberSubscriber(youTuber);
        YouTuberSubscriber ytSub03 = new YouTuberSubscriber(youTuber);
        youTuber.addSubscriber(ytSub01);
        youTuber.addSubscriber(ytSub02);
        youTuber.addSubscriber(ytSub03);

        youTuber.setStatusMessage("Status 01");
        Assert.assertEquals("Status 01", ytSub01.getStateMessage());

        youTuber.removeSubscriber(ytSub01);

        youTuber.setStatusMessage("Status 02");
        Assert.assertEquals("Status 01", ytSub01.getStateMessage());

    }
}
