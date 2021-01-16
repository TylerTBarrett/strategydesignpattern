import java.util.Random;

public class Receiver extends Player {
    public static final int OFFENSE_VAL = 2;

    public Receiver(String name){
        super(name);
    }
    public void setOffenseBehaviour(){
        Random r = new Random();
        int roll = r.nextInt(OFFENSE_VAL);
        if(roll == 0)
            this.offenseBehaviour = new RunBehaviour();
        else if(roll == 1)
            this.offenseBehaviour = new ReceiveBehaviour();
    }
    public void setDefenceBehaviour(){

    }
}
