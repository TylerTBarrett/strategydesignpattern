/**
 * A football player
 * @author Tyler Barrett
 * 
 */
public abstract class Player{
    protected String name;
    private Boolean defence;
    protected DefenceBehaviour defenceBehaviour;
    protected OffenseBehaviour offenseBehaviour;

    /**
     * Constructs a player with the provided name
     * @param name A String which will be provided for the player's name
     */
    public Player(String name){
        if(name != null)
            this.name = name;
        this.defence = false;
        this.defenceBehaviour = null;
        this.offenseBehaviour = null;
    }
    /**
     * Forces children class to set the DefenceBehaviour
     */
    public abstract void setDefenceBehaviour();
    /**
     * Forces children class to set OffenseBehaviour
     */
    public abstract void setOffenseBehaviour();
    /**
     * This method will randomize the Defence or Offense Behaviour
     * depending on the value of defence then 
     * return a string based on that behaviour
     * @return A String will be returned with the behaviour selected
     */
    public String play()
    {
        if(defence)
        {
            setDefenceBehaviour();
            if(defenceBehaviour != null)
                return defenceBehaviour.play();
            else
                return "is not playing right now";
        }
        else
        {
            setOffenseBehaviour();
            return offenseBehaviour.play();
        }
    }
    /**
     * Will always change the value of the Boolean defence
     * to the opposite value it currently is, ie assigning players on defence
     * to become players on offence etc.
     */
    public void turnover()
    {
        if(this.defence == true)
            this.defence = false;
        else
            this.defence = true;
    }
}