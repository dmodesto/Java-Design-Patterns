import StrategyPattern.Duck;
import StrategyPattern.FlyByNotFlying;
import StrategyPattern.FlyByWings;
import org.junit.Assert;
import org.junit.Test;

public class StrategyPatternTest {

    @Test
    public void returnAMethodOfFlying() {
        Duck mallardDuck = new Duck(new FlyByWings());

        Assert.assertNotEquals("",mallardDuck.fly());
    }

    @Test
    public void returnAFlyingByWings() {
        Duck mallardDuck = new Duck(new FlyByWings());

        Assert.assertEquals("I'm flying by flapping my wings!", mallardDuck.fly());
    }

    @Test
    public void returnNoFlying() {
        Duck decoyDuck = new Duck(new FlyByNotFlying());

        Assert.assertEquals("I can't fly!", decoyDuck.fly());
    }
}
