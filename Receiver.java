public class Receiver extends Player {
    public static final int OFFENSE_VAL = 2;

    public Receiver(String name){
        super(name);
    }
    public void setOffenseBehaviour(){
        this.offenseBehaviour = new ReceiveBehaviour();
    }
    public void setDefenceBehaviour(){
        defenceBehaviour = null;
    }
    public String toString(){
        return "Receiver " + this.name;
    }
}
