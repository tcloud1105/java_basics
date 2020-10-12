package file;

import java.util.Formatter;

public class File_Operation_46 {
    public static void main(String[] args){
        final Formatter x;

        try{
            x = new Formatter("savi.txt");

            System.out.println("you created a file");
        }catch (Exception e){
           System.out.println("you got an error!!");
        }
    }
}
