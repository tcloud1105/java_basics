package file;

import file.Create_File_47;

public class File_In_Action_45 {
    public static void main(String[] args){
//        File f = new File("F:\\Programming Code\\Java\\Java Basics\\src\\file.txt");
//        if(f.exists())
//            System.out.println(f.getName() + " exist!");
//        else
//            System.out.println("this doesnt exist");
//        Create_File_47 c = new Create_File_47();
//        c.openFile();
//        c.addRecords();
//        c.closeFile();
        Read_File_48 r = new Read_File_48();
        r.openFile();
        r.readFile();
        r.closeFile();
    }
}
