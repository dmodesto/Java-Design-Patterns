package StrategyPattern;

public class SpeakByQuack implements SpeakingBehavior{
    public String speak() {
        return ("I'm Quacking!");
    }
}
