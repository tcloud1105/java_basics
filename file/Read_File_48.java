package file;

import java.io.File;
import java.util.Scanner;

public class Read_File_48 {
    private Scanner x;

    public void openFile(){
        try{
            x = new Scanner(new File("savi.txt"));
        }catch (Exception e){
            System.out.println("could not find file");
        }
    }

    public void readFile(){
        while(x.hasNext()){
            String a = x.next();
            String b = x.next();
            String c = x.next();

            System.out.printf("%s %s %s\n",a,b,c);
        }

    }

    public void closeFile(){
        x.close();
    }
}
