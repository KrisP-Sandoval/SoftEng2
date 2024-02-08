

public class Character {
    private ActionType actionType;

    public Character(ActionType actionType) {
        this.actionType = actionType;
    }

    public String KnightAttack(){
        return "Your Character, the " + actionType + " is attacking" + "\n" + 
        actionType.SwordSlash();
    }

    public String KnightDefend(){
        return "Your Character, the " + actionType + " is defending" + "\n" + 
        actionType.SheildBlock() +
        actionType.DodgeCounter() +
        actionType.MagicBarrier();
    }

    public String WizardAttack(){
        return "Your Character, the " + actionType + " is attacking" + "\n" + 
        actionType.SpellCast();
    }

    public String WizardDefend(){
        return "Your Character, the " + actionType + " is defending" + "\n" + 
        actionType.MagicBarrier();
    }

    public String ArcherAttack(){
        return "Your Character, the " + actionType + " is attacking" + "\n" + 
        actionType.ArrowShot();
    }

    public String ArcherDefend(){
        return "Your Character, the " + actionType + " is defending" + "\n" + 
        actionType.DodgeCounter();
    }
}