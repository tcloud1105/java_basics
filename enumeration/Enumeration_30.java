package enumeration;

public enum Enumeration_30 {
     person1("nice","22"),
    person2("cutie","10"),
    person3("handsome","31"),
    person4("crazy","24"),
    person5("different","23"),
    person6("serious","29");

     private final String desc;
     private final String year;

     Enumeration_30(String description, String bday){
         desc = description;
         year = bday;
     }

     public String getDesc(){
         return desc;
     }

     public String getYear(){
         return year;
     }
}
