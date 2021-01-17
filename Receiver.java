/**
 * A type of Player
 * @author Tyler Barrett
 * 
 */

public class Receiver extends Player {
    /**
     * An integer indicating the possible behaviours of the receiver on offense
     */
    public static final int OFFENSE_VAL = 2;

    /**
     * Will construct a receiver based on the provided name
     * @param name A String which will be used to set the value of the receiver's name
     */
    public Receiver(String name) {
        super(name);
    }

    /**
     * Sets the offensive behaviour to Receiver behaviour
     */
    public void setOffenseBehaviour() {
        this.offenseBehaviour = new ReceiveBehaviour();
    }

    /**
     * Sets the offensive behaviour to null
     */
    public void setDefenceBehaviour() {
        defenceBehaviour = null;
    }

    /**
     * Will generate a String including the type of player the Receiver is and their name
     * @return A String containing the name and type of player
     */
    public String toString() {
        return "Receiver " + this.name;
    }
}
