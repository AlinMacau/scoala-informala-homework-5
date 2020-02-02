package ex2;

public class Country {
    private String name;
    private String code;

    public void setCountries(String name, String code) {
        this.name = name;
        this.code = code;
    }

    @Override
    public String toString() {
        return name;
    }
}
