package StrategyPattern;

public class Duck {

    private FlyingBehavior flightBehavior;
    private SpeakingBehavior speakBehavior;

    public Duck(FlyingBehavior flightBehavior, SpeakByQuack speakBehavior) {
        this.flightBehavior = flightBehavior;
        this.speakBehavior = speakBehavior;
    }

    public String fly() {
        return flightBehavior.fly();
    }

    public String speak() {
        return speakBehavior.speak();
    }
}
