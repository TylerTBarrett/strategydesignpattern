/**
 * The behaviour to be expected for an offensive Block
 * @author Tyler Barrett
 * 
 */
public class OBlockBehaviour implements OffenseBehaviour{
    /**
     * returns the behaviour for an offensive block
     * @return A String specifying the behaviour of an offensive block
     */
    public String play(){
        return "block defenders";
    }
}
