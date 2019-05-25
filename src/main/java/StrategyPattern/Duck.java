package StrategyPattern;

public class Duck {

    private FlyingBehavior flightBehavior;

    public Duck(FlyingBehavior flightBehavior) {
        this.flightBehavior = flightBehavior;
    }

    public String fly() {
        return flightBehavior.fly();
    }
}
