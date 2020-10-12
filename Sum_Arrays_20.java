public class Sum_Arrays_20 {
    public static void main(String[] args){
        int array[] = {21,16,86,21,3};
        int sum=0;

        for(int i=0;i<array.length;i++){
            sum += array[i];
        }

        System.out.println(sum);
    }
}
