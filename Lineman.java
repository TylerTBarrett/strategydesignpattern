import java.util.Random;
public class Lineman extends Player {
    public static final int DEFENSE_VAL = 3;
    Random r = new Random();
    
    public Lineman(String name){
        super(name);
    }
    public void setOffenseBehaviour()
    {
        offenseBehaviour = new OBlockBehaviour();
    }
    public void setDefenceBehaviour()
    {
        int roll = r.nextInt(DEFENSE_VAL);
        if(roll == 0)
            defenceBehaviour = new BlockBehaviour();
        else if (roll == 1)
            defenceBehaviour = new StripBehaviour();
        else if (roll == 2)
            defenceBehaviour = new SackBehaviour();
    }
    public String toString(){
        return "Lineman " + this.name;
    }
}
