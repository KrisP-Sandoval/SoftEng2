package StrategyPattern;

public class SpellCast implements AttackStrategy {
    public String attack() {
        String action = new String();
        action += "Casting a spell to attack!";

        return action;
    }
}
