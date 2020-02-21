package ex2;

/**
 * Adress class that keeps the street and the country for hobbies
 *
 */

public class Adress {
    private String street;
    private Country country;

    /**
     * setting adress where hobbies can be practiced
     *
     * @param street
     * @param country
     */
    public void setAdress(String street, Country country) {
        this.street = street;
        this.country = country;
    }

    @Override
    public String toString() {
        return " " + country;
    }
}
