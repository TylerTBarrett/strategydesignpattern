/**
 * A specific type of player
 * @author Tyler Barrett
 * 
 */

import java.util.Random;

public class QuarterBack extends Player {
    /**
     * An integer indicating the possible offensive behaviour options
     */
    public static final int OFFENSE_VAL = 2;

    /**
     * Constructs a QuarterBack based on the provided name
     * @param A String which will be assigned to be the QuarterBack's name
     */
    public QuarterBack(String name) {
        super(name);
    }

    /**
     * Will Randomly assign the offensive behaviour for the QuarterBack
     */
    public void setOffenseBehaviour() {
        Random r = new Random();
        int random = r.nextInt(OFFENSE_VAL);
        if(random == 0)
            this.offenseBehaviour = new PassBehaviour();
        else if(random == 1)
            this.offenseBehaviour = new RunBehaviour();
    }

    /**
     * Will set the Defence behaviour of the QuarterBack to null
     */
    public void setDefenceBehaviour() {
        defenceBehaviour = null;
    }

    /**
     * Will return a String indicating the player's name and what kind of player they are
     * @return A String that specifies the type of player and their name
     */
    public String toString() {
        return "QuarterBack: " + this.name;
    }
}
