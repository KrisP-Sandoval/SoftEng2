package StrategyPattern;

public class CharacterDemo {
    public static void main(String[] args) {
        Character knight = new Character("Knight", new SwordSlash(), new Block());
        Character wizard = new Character("Wizard", new SpellCast(), new Barrier());
        Character archer = new Character("Archer", new ArrowShot(), new Dodge());

        System.out.println(knight.performAttack());
        System.out.println(knight.performDefend());

        System.out.println(wizard.performAttack());
        System.out.println(wizard.performDefend());

        System.out.println(archer.performAttack());
        System.out.println(archer.performDefend());

    }
}
