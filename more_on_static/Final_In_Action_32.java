package more_on_static;

public class Final_In_Action_32 {
    private int sum;
    private final int NUMBER;

    public Final_In_Action_32(int x){
        NUMBER = x;
    }

    public void add(){
        sum+=NUMBER;

    }

    public String toString(){
        return String.format("sum = %d\n",sum);
    }
}
