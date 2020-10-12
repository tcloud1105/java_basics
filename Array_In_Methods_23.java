public class Array_In_Methods_23 {
    public static void main(String[] args){
        int array[] = {3,4,5,6,7};

        for(int element : array){
            System.out.println(element);
        }

        change(array);

        for(int element : array){
            System.out.println(element);
        }
    }

    public static void change(int x[]){
        for(int counter=0; counter<x.length;counter++){
            x[counter] += 5;
        }
    }
}
