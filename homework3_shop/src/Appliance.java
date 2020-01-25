public class Appliance extends ElectronicsProduct {
    int guaranteePeriod = 6;
    int quantity;
    double price;

    public Appliance(String name, double price, int quantity, String ageRestriction) {
        super(name, price, quantity, ageRestriction);
    }

    public double Appliance(){
        if(quantity < 50){
            price = price * 105/100;
        }
        return price;
    }

    @Override
    public int getGuaranteePeriod() {
        return guaranteePeriod;
    }

    @Override
    public void setGuaranteePeriod(int guaranteePeriod) {
        this.guaranteePeriod = guaranteePeriod;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}

