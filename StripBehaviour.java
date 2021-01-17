/**
 * The expected behaviour for stripping a player with a ball on defence
 * @author Tyler Barrett
 * 
 */

public class StripBehaviour implements DefenceBehaviour {

    /**
     * Will non-randomly generate a String based on the strip behaviour
     * @return A String based on the strip behaviour
     */
    public String play() {
        return "Strip a ball from runnners hands";
    }
}
