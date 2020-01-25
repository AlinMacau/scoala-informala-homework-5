public class ElectronicsProduct extends Product {
    private int guaranteePeriod;


    public ElectronicsProduct(String name, double price, int quantity, String ageRestriction) {
        super(name, price, quantity, ageRestriction);
    }

    public int getGuaranteePeriod() {
        return guaranteePeriod;
    }

    public void setGuaranteePeriod(int guaranteePeriod) {
        this.guaranteePeriod = guaranteePeriod;
    }
}
