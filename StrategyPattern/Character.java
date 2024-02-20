package StrategyPattern;

public class Character {
    private String type;
    private AttackStrategy attackStrategy;
    private DefenseStrategy defenseStrategy;

    public Character(String type, AttackStrategy attackStrategy, DefenseStrategy defenseStrategy) {
        this.type = type;
        this.attackStrategy = attackStrategy;
        this.defenseStrategy = defenseStrategy;
    }

    public String performAttack() {
        return type + " " + attackStrategy.attack() + "\n";
    }

    public String performDefend() {
        return type + " " + defenseStrategy.defend() + "\n";
    }

}
