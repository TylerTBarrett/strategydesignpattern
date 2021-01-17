/**
 * Block Behaviour for players on defence
 * @author Tyler Barrett
 * 
 */

import java.util.Random;

public class BlockBehaviour implements DefenceBehaviour {

    /**
     * Value for the number of randomized choices that could be blocked
     */
    public static final int BLOCK_CHOICE_VAL = 4;
    String[] blockChoice = {"kick", "punt", "pass", "catch"};

    /**
     * 
     * @return Will return a String with a randomly generated blocking behaviour
     */
    public String play() {
        Random r = new Random();
        int roll = r.nextInt(BLOCK_CHOICE_VAL);
        return "block a " + blockChoice[roll];
    }
}
