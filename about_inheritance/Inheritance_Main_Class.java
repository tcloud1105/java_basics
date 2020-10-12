package about_inheritance;

public class Inheritance_Main_Class {
    public static void main(String[] args){
//        SubClass1 sb1 = new SubClass1();
//        SubClass2 sb2 = new SubClass2();
        Inheritance_In_Action_33 array[] = new Inheritance_In_Action_33[2];
        array[0] = new SubClass1();// polymorphism in action
        array[1] = new SubClass2();

     for(Inheritance_In_Action_33 x: array){
         x.eat();
     }

    }
}
