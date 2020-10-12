package more_on_static;

public class Static_Main_Class {
    public static void main(String[] args){
        Static_In_Action_31 member1 = new Static_In_Action_31("cedric", "Fotso");
        Static_In_Action_31 member2 = new Static_In_Action_31("David","Fox");
        Static_In_Action_31 member3 = new Static_In_Action_31("Junior","Fotso");

       System.out.println();
       System.out.println(Static_In_Action_31.getMembers());

       Final_In_Action_32 t = new Final_In_Action_32(10);
       for(int i=0; i<5; i++){
           t.add();
           System.out.printf("%s", t);
       }
    }
}
