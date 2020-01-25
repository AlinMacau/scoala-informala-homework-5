public class Product implements Buyable {

    public static final String AGE_RESTRICTION_NONE = "none";
    public static final String AGE_RESTRICTION_TEENAGER_AND_ABOVE = "teenager";
    public static final String AGE_RESTRICTION_ADULT_ONLY = "adult";

    private String name;
    private double price;
    private int quantity;
    private String ageRestriction;

    public Product(String name, double price, int quantity, String ageRestriction) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.ageRestriction = ageRestriction;
    }

    public Product() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(String ageRestriction) {
        this.ageRestriction = ageRestriction;
    }
}
