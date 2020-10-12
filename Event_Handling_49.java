import java.util.Scanner;

public class Event_Handling_49 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x= 1;
        do{
            try{
                System.out.println("Enter first num: ");
                int n1 = input.nextInt();
                System.out.println("Enter second num: ");
                int n2 = input.nextInt();
                int sum = n1/n2;
                System.out.println(sum);
                x=2;
            }catch (ArithmeticException e){
                System.out.println("division by zero impossible: ");
            }
        }while(x==1);


    }
}
