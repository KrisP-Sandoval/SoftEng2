package StrategyPattern;

public class Dodge implements DefenseStrategy {
    public String defend() {
        String action = new String();
        action += "Using a swift tumble to dodge!";

        return action;
    }
}
