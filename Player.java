public abstract class Player{
    protected String name;
    private Boolean defence;
    protected DefenceBehaviour defenceBehaviour;
    protected OffenseBehaviour offenseBehaviour;

    public Player(String name){
        if(name != null)
            this.name = name;
        this.defence = false;
        this.defenceBehaviour = null;
        this.offenseBehaviour = null;
    }
    public abstract void setDefenceBehaviour();
    public abstract void setOffenseBehaviour();
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
    public void turnover()
    {
        if(this.defence == true)
            this.defence = false;
        else
            this.defence = true;
    }
}