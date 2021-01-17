import java.util.Random;

public class PassBehaviour implements OffenseBehaviour{
    public static final int PASS_CHOICE_VAL = 5;
    String[] passChoice = {"slant route", "out route", "seem route", "screen pass", "hail mary"};
    Random r = new Random();
    public String play(){
        int roll = r.nextInt(PASS_CHOICE_VAL);
        return "throws a " + passChoice[roll];
    }
}
