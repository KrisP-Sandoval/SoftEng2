package StrategyPattern;

public class ArrowShot implements AttackStrategy {
    public String attack() {
        String action = new String();
        action += "Shooting an arrow!";

        return action;
    }
}
