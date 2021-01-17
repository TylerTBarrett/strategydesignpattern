import java.util.Random;
public class RunBehaviour implements OffenseBehaviour{
    public static final int RUN_CHOICE_VAL = 4;
    String[] runChoice = {"drive (up the gut)", "draw","pitch","reverse"};
    Random r = new Random();
    public String play(){
        int roll = r.nextInt(RUN_CHOICE_VAL);
        return "runs a " + runChoice[roll];
    }
}
