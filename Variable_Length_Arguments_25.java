public class Variable_Length_Arguments_25 {
    public static void main(String[] args){

        System.out.println(average(1,2,3));
        System.out.println(average(2,8,9,11 ));
    }

    public static int average(int...numbers){
        int total=0;
        for(int x : numbers){
            total += x;
        }
        return total/numbers.length;
    }
}
