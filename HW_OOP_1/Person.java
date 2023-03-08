package HW_OOP_1;

import java.util.ArrayList;


public class Person {


    private String name;
    private ArrayList<FamilyLine> status;

    private String sex;

    public String getName() {
        return name;
    }

    public ArrayList<FamilyLine> getStatus() {
        return status;
    }

    public String getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(ArrayList<FamilyLine> status) {
        this.status = status;
    }
    public void setSex(String sex) {
        this.name = sex;
    }
    public void PrintPersonConnection (Person PersonA){
        System.out.print(PersonA.getName());
        if (PersonA.getStatus().size() ==0) {
            System.out.print(" сирота");
        }
        else {
            for (int i = 0; i < status.size(); i++) {
                FamilyLine ForPrint = status.get(i);
                System.out.println();
                System.out.print(ForPrint.getPersonF());
                System.out.print(" " + ForPrint.getConnection());
                System.out.println(" " + ForPrint.getPersonS());
            }
        }
    }
}
