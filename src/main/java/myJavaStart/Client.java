package myJavaStart;

public class Client {
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastnam() {
        return lastnam;
    }

    public void setLastnam(String lastnam) {
        this.lastnam = lastnam;
    }

    public boolean isClientPremium() {
        return clientPremium;
    }

    public void setClientPremium(boolean clientPremium) {
        this.clientPremium = clientPremium;
    }

    private String firstname;
    private String lastnam;
    private boolean clientPremium;

    public Client(String firstname, String lastnam, boolean clientPremium) {
        this.firstname = firstname;
        this.lastnam = lastnam;
        this.clientPremium = clientPremium;
    }
}
