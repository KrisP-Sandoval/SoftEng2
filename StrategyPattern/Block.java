package StrategyPattern;

public class Block implements DefenseStrategy {

    public String defend() {
        String action = new String();
        action += "Using a shield to block!";

        return action;
    }
}
