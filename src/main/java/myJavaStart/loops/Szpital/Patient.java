package myJavaStart.loops.Szpital;

public class Patient {


    private String firstname;
    private String lastname;
    private String PESEL;


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Patient(String firstname, String lastname, String PESEL) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.PESEL = PESEL;
    }
    public Patient() {

    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPESEL() {
        return PESEL;
    }

    public void setPESEL(String PESEL) {
        this.PESEL = PESEL;
    }


}
