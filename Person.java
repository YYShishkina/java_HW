import java.util.ArrayList;

public class Person {


    private String name;
    private ArrayList<FamilyLine> status;

    public String getName() {
        return name;
    }

    public ArrayList<FamilyLine> getStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(ArrayList<FamilyLine> status) {
        this.status = status;
    }
}
