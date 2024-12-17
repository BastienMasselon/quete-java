public class Wilder {
    private String firstname;
    private boolean aware;

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    public String WhoAmI() {
        return "Je m'appelle " + this.firstname + " et je " +(this.aware ? "" : "ne ") + "suis " + (this.aware ? "" : "pas ") + "aware";
    }

    public String getFirstname() {
        return this.firstname;
    }

    public boolean isAware() {
        return this.aware;
    }

    public void setFirstname(String firstName) {
        this.firstname = firstName;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }
}