

public class FamilyLine {

    public Person PersonF;
    public Person PersonS;
    public String connection;

    public Person getPersonF() {
        return PersonF;
    }

    public Person getPersonS() {
        return PersonS;
    }

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public void setPersonF(Person personF) {
        this.PersonF = personF;
    }

    public void setPersonS(Person personS) {
        this.PersonS = personS;
    }

    public FamilyLine (Person PersonF, Person PersonS, String connection){
        this.PersonF = PersonF;
        this.PersonS = PersonS;
        this.connection=connection;
    }
}
