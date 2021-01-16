import java.util.Random;
public class QuarterBack extends Player {
    public static final int OFFENSE_VAL = 2;
    
    public QuarterBack(String name)
    {
        super(name);
    }
    public void setOffenseBehaviour()
    {
        Random r = new Random();
        int random = r.nextInt(OFFENSE_VAL);
        if(random == 0)
            this.offenseBehaviour = new PassBehaviour();
        else if(random == 1)
            this.offenseBehaviour = new RunBehaviour();
    }
    public void setDefenceBehaviour(){

    }
}
