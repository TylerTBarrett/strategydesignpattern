/**
 * The behaviour expected for an offensive pass
 * @author Tyler Barrett
 * 
 */

import java.util.Random;

public class PassBehaviour implements OffenseBehaviour {

    /**
     * An integer specifying the number of possible pass choices
     */
    public static final int PASS_CHOICE_VAL = 5;
    String[] passChoice = {"slant route", "out route", "seem route", "screen pass", "hail mary"};

    /**
     * Generates a random pass behaviour
     * @return A String based on the random pass behaviour
     */
    public String play() {
        Random r = new Random();
        int roll = r.nextInt(PASS_CHOICE_VAL);
        return "throws a " + passChoice[roll];
    }
}
