public class Enhanced_For_Loop_22 {
    public static void main(String[] args){
       int array[] = {3,4,5,6,7};
       int total=0;

       for(int element : array){
           total += element;
       }

       System.out.println("The total is: "+total);
    }
}
