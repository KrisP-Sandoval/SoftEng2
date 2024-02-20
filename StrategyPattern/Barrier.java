package StrategyPattern;

public class Barrier implements DefenseStrategy {
    public String defend() {
        String action = new String();
        action += "Using magic in order to create a barrier!";

        return action;
    }
}
