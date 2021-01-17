/**
 * The Run behaviour for a player on offense
 * @author Tyler Barrett
 * 
 */

import java.util.Random;

public class RunBehaviour implements OffenseBehaviour {
    /**
     * An integer indicating the possible number of run choices
     */
    public static final int RUN_CHOICE_VAL = 4;
    String[] runChoice = {"drive (up the gut)", "draw","pitch","reverse"};
    Random r = new Random();

    /**
     * Will randomly generate a type of run behaviour
     * @return A String based on the type of behaviour
     */
    public String play() {
        int roll = r.nextInt(RUN_CHOICE_VAL);
        return "runs a " + runChoice[roll];
    }
}
