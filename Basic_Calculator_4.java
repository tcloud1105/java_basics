import java.util.Scanner;

public class Basic_Calculator_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double fnum,snum,answer;
        System.out.println("Enter first Number: ");
        fnum = sc.nextDouble();
        System.out.println("Enter second Number: ");
        snum = sc.nextDouble();

        answer = fnum + snum;
        System.out.println("the result is: "+ answer);

    }
}
