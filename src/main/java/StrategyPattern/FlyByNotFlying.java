package StrategyPattern;

public class FlyByNotFlying implements FlyingBehavior {
    public String fly() {
        return ("I can't fly!");
    }
}
