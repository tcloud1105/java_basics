package classes;

public class Example_3 {
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void say(){
         System.out.printf("Your first name was %s", getName());
    }
}
