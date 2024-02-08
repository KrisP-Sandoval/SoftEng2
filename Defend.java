public class Defend implements ActionType{
    public String SheildBlock{
        String action = new String();
        action += "Your Character used Sword Slash!";

        return action;
    }

    public String DodgeCounter{
        String action = new String();
        action += "Your Character is Spell Casting!";

        return action;
    }

    public String MagicBarrier{
        String action = new String();
        action += "Your Character shoots an Arrow!";

        return action;
    }
    
}
