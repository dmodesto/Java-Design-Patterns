package DecoratorPattern;

public class Soy extends AddOnDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
        this.cost = 1.0;
        this.description = "with Soy";
    }

    public double Cost() {
        return this.cost + beverage.Cost();
    }

    public String Description() {
        return this.description + " " + beverage.Description();
    }
}
