package StrategyPattern;

public class SwordSlash implements AttackStrategy {
    public String attack() {
        String action = new String();
        action += "Swinging a sword to slash enemies!";

        return action;
    }
}
