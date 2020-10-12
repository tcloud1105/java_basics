package time;

public class Composition_29 {
    private String name;
    private ToString_App_28 birthday;

    public Composition_29(String n, ToString_App_28 b){
        name = n;
        birthday = b;
    }

    public String toString(){
        return String.format("my name is %s, my birthday is %s",name,birthday);
    }
}
