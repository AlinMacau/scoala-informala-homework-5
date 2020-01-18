import java.util.Date;

public class FoodProduct extends Product implements Expirable{
    private String name;
    private double price;
    private int quantity;
    private String ageRestriction;
    private Date expirationDate;

    public FoodProduct(String name, double price, int quantity, String ageRestriction) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.ageRestriction = ageRestriction;
        this.expirationDate = getExpirationDate();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
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
    public String getAgeRestriction() {
        return ageRestriction;
    }

    @Override
    public void setAgeRestriction(String ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    @Override
    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}
