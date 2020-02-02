package ex2;

/**
 * Name class that keeps the names and codes for countries
 */

public class Country {
    private String name;
    private String code;

    /**
     * settting the country where the hobby cand be practiced
     *
     * @param name
     * @param code
     */
    public void setCountries(String name, String code) {
        this.name = name;
        this.code = code;
    }

    @Override
    public String toString() {
        return name;
    }
}
