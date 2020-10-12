import java.util.Scanner;

public class Simple_Average_14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int grade;
        int average;
        int counter = 0;

        while(counter < 10){
            grade = sc.nextInt();
            total += grade;// total = total + grade
            counter++;
        }
        average = total/10;
        System.out.println("The average is "+ average);
    }
}
