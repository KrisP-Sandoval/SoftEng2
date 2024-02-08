public class Attack implements ActionType{
    public String SwordSlash{
        String action = new String();
        action += "Your Character used Sword Slash!";

        return action;
    }

    public String SpellCast{
        String action = new String();
        action += "Your Character is Spell Casting!";

        return action;
    }

    public String ArrowShot{
        String action = new String();
        action += "Your Character shoots an Arrow!";

        return action;
    }
    
}
