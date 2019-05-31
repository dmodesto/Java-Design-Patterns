import DecoratorPattern.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class DecoratorPatternTest {
    private Beverage beverage;

    @Before
    public void setup() {
        beverage = new Coffee();
    }

    @Test
    public void returnBasicObject() {
        Assert.assertEquals(beverage.getClass().getSimpleName(), "Coffee");
    }

    @Test
    public void returnCafeMochaObject() {
        beverage = new CafeMocha(beverage);

        Assert.assertEquals(beverage.getClass().getSimpleName(), "CafeMocha");
    }

    @Test
    public void returnCorrectCoffeeCost() {
        Assert.assertThat(((Coffee)beverage).Cost(), is(2.0));
    }

    @Test
    public void returnCorrectCafeMochaCost() {
        beverage = new CafeMocha(beverage);

        Assert.assertThat(((CafeMocha)beverage).Cost(), is(3.0));
    }

    @Test
    public void returnCafeMochaSoyWhipCreamDescription() {
        beverage = new Soy(beverage);
        beverage = new WhipCream(beverage);
        beverage = new CafeMocha(beverage);

        Assert.assertThat(((CafeMocha)beverage).Description(), is("Cafe Mocha with Whip Cream with Soy Coffee"));
    }
}
