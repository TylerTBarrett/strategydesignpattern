import java.util.Random;

public class BlockBehaviour implements DefenceBehaviour {
    public static final int BLOCK_CHOICE_VAL = 4;
    String[] blockChoice = {"kick","punt","pass","catch"};
    Random r = new Random();
    public String play(){
        int roll = r.nextInt(BLOCK_CHOICE_VAL);
        return "block a " + blockChoice[roll];
    }
}
