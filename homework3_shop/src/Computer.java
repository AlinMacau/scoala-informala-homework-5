public class Computer extends ElectronicsProduct {
    int guaranteePeriod = 24;
    int quantity;
    double price;

    public Computer(String name, double price, int quantity, String ageRestriction) {
        super(name, price, quantity, ageRestriction);
    }

    public double Computer(){
        if(quantity > 1000){
            price = price * 95/100;
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
