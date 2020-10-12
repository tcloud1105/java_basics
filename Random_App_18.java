import java.util.Random;

public class Random_App_18 {
    public static void main(String[] args){
        Random rd = new Random();
        int number;

 for(int counter=1; counter<=10;counter++){
        number = 1 + rd.nextInt(6);
        System.out.println(number + " ");
      }
    }
}
