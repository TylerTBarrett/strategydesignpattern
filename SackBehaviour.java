/**
 * The behaviour expected for a sack
 * @author Tyler Barrett
 * 
 */

public class SackBehaviour implements DefenceBehaviour {

    /**
     * Will non-randomly generate a String for the sack behaviour
     * @return A String based on the sack behaviour
     */
    public String play() {
        return "Sack the quarterback";
    }
}