package DecoratorPattern;

public class Coffee extends Beverage {
    public Coffee() {
        cost = 2.0;
        description = "Coffee";
    }

    public double Cost() {
        return this.cost;
    }

    public String Description() {
        return "Coffee";
    }
}
