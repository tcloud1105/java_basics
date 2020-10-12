package enumeration;

import java.util.EnumSet;

public class Enum_In_Action {
    public static void main(String[] args){
//        for(Enumeration_30 people : Enumeration_30.values()){
//            System.out.printf("%s\t %s\t %s\t\n",people, people.getDesc(),people.getYear());
//        }

        System.out.println("\nAnd now for the range of constants!\n");

        for(Enumeration_30 people: EnumSet.range(Enumeration_30.person3,Enumeration_30.person5)){
            System.out.printf("%s\t %s\t %s\t\n",people, people.getDesc(),people.getYear());
        }
    }
}
