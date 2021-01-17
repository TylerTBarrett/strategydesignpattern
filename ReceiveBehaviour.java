import java.util.Random;

public class ReceiveBehaviour implements OffenseBehaviour{
    public static final int RECEIVE_CHOICE_VAL = 5;
    String[] receiveChoice = {"slant route", "out route", "seem route", "screen pass", "hail mary"};
    Random r = new Random();
    public String play(){
        int roll = r.nextInt(RECEIVE_CHOICE_VAL);
        return "runs a " + receiveChoice[roll];
    }
}
