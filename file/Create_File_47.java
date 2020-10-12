package file;

import java.util.Formatter;

public class Create_File_47 {
    private Formatter x;

    public void openFile(){
        try{
            x = new Formatter("french.txt");
        }catch (Exception e){
            System.out.println("You have an error");
        }
    }

    public void addRecords(){
        x.format("%s%s%s","20 ","cedric ","fotso");
    }

    public void closeFile(){
        x.close();
    }

}
