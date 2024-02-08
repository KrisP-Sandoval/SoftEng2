

public class GameApp{
    public static void main(String[] args){
        
        Character knightAtk = new Character(new Attack());
        Character wizardAtk = new Character(new Attack());
        Character archerAtk = new Character(new Attack());

        Character knightDef = new Character(new Defend());
        Character wizardDef = new Character(new Defend());
        Character archerDef = new Character(new Defend());

        System.out.println(knightAtk.SwordSlash());
        System.out.println(wizardDef.MagicBarrier());

        System.out.println(wizardAtk.SpellCast());
        System.out.println(archerDef.DodgeCounter());

        System.out.println(archerAtk.ArrowShot());
        System.out.println(knightDef.SheildBlock());
    }
}