/**
 * An interface governing the offensive behaviour
 * @author Tyler Barrett
 * 
 */
public interface OffenseBehaviour{
    /**
     * Will generate a (potentially) random behaviour for the specified offensive behaviour
     * @return A String based on the offensive behaviour
     */
    public String play();
}