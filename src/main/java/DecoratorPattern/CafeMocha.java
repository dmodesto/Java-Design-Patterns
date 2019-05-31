package DecoratorPattern;

public class CafeMocha extends AddOnDecorator {

    public CafeMocha(Beverage beverage) {
        this.beverage = beverage;
        this.cost = 1.0;
        this.description = "Cafe Mocha";
    }

    public double Cost() {
        return this.cost + beverage.Cost();
    }

    public String Description() {
        return this.description + " " + beverage.Description();
    }
}
