import java.util.Scanner;

public class Increment_Operator_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x1 = 5;
        int x2 = 18;
        //++x1;

        //System.out.println(x1++);
        //System.out.println(x2--);
        x1 = x1 + 5;
        x2  -= 8;
        System.out.println(x1);
        System.out.println(x2);
    }
}
