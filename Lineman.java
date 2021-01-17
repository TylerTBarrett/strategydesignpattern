/**
 * A specific type of player
 * @author Tyler Barrett
 * 
 */

import java.util.Random;

public class Lineman extends Player {
    /**
     * Integer indicating the number of possible defense behaviours
     */
    public static final int DEFENSE_VAL = 3;
    Random r = new Random();

    /**
     * Constructs a Lineman based on the provided name
     * @param name A String which will be used to set the Lineman's name
     */
    public Lineman(String name) {
        super(name);
    }

    /**
     * Sets the offensive behaviour
     */
    public void setOffenseBehaviour() {
        offenseBehaviour = new OBlockBehaviour();
    }

    /**
     * Randomly sets the Defensive behaviour
     */
    public void setDefenceBehaviour() {
        int roll = r.nextInt(DEFENSE_VAL);
        if(roll == 0){
            defenceBehaviour = new BlockBehaviour();
        } else if (roll == 1){
            defenceBehaviour = new StripBehaviour();
        } else if (roll == 2){
            defenceBehaviour = new SackBehaviour();
        }
    }

    /**
     * Returns a String specifying the type of player and their name
     */
    public String toString() {
        return "Lineman " + this.name;
    }
}
