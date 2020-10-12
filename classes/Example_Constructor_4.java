package classes;

public class Example_Constructor_4 {
    private String name;

    public Example_Constructor_4(String name){
      this.name = name;
    }
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
