package ex2;

public class Adress {
    private String street;
    private Country country;

    public void setAdress(String street, Country country) {
        this.street = street;
        this.country = country;
    }

    @Override
    public String toString() {
        return " " + country;
    }
}
