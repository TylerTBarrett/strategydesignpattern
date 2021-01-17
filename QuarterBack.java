import java.util.Random;
public class QuarterBack extends Player {
    public static final int OFFENSE_VAL = 2;
    Random r = new Random();
    
    public QuarterBack(String name)
    {
        super(name);
    }
    public void setOffenseBehaviour()
    {
        
        int random = r.nextInt(OFFENSE_VAL);
        if(random == 0)
            this.offenseBehaviour = new PassBehaviour();
        else if(random == 1)
            this.offenseBehaviour = new RunBehaviour();
    }
    public void setDefenceBehaviour(){
        defenceBehaviour = null;
    }
    public String toString(){
        return "QuarterBack: " + this.name;
    }
}
