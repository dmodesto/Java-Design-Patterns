package DecoratorPattern;

public class WhipCream extends AddOnDecorator {

    public WhipCream(Beverage beverage) {
        this.beverage = beverage;
        this.cost = 0.5;
        description = "with Whip Cream";
    }

    public double Cost() {
        return this.cost + beverage.Cost();
    }

    public String Description() {
        return this.description + " " + beverage.Description();
    }
}
