package more_on_static;

public class Static_In_Action_31 {
    private String first;
    private String last;
    private static int members = 0;

    public Static_In_Action_31(String fn, String ln){
        first = fn;
        last = ln;
        members++;
        System.out.printf("Constructor for %s %s , members in the club: %d\n",first, last, members);
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public static void setMembers(int members) {
        Static_In_Action_31.members = members;
    }

    public static int getMembers() {
        return members;
    }

    public void setLast(String last) {
        this.last = last;
    }
}
