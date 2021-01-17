/**
 * The behaviour as would be expected of a receiver on offense
 * @author Tyler Barrett
 * 
 */
import java.util.Random;
public class ReceiveBehaviour implements OffenseBehaviour{
    /**
     * An integer indicating the number of potential receiver choices
     */
    public static final int RECEIVE_CHOICE_VAL = 5;
    String[] receiveChoice = {"slant route", "out route", "seem route", "screen pass", "hail mary"};
    Random r = new Random();
    /**
     * Will generate a random receiver behaviour and return it as a String
     * @return A String indicating the receiver behaviour
     */
    public String play(){
        int roll = r.nextInt(RECEIVE_CHOICE_VAL);
        return "runs a " + receiveChoice[roll];
    }
}
