import static shop.Product.AGE_RESTRICTION_ADULT_ONLY;
import static shop.Product.AGE_RESTRICTION_TEENAGER_AND_ABOVE;


public class PurchaseManager {
    public static void processPurchase(Product product, Customer customer) {
        //case1
        if (product.getQuantity() < 1) {//verify if the product has stock and modify the quantity; prints in both cases;
            System.out.println("The product is out of stock");
        } else {
            //case 3
            if (customer.getBalance() - product.getPrice() < 0) {//verify if the customer has enough money and modify the balance; prints in both cases;
                System.out.println("You do not have enough money to buy this product");
            } else {
                //case 4
                if (product.getAgeRestriction().equals(AGE_RESTRICTION_TEENAGER_AND_ABOVE)) {
                    if (customer.getAge() < 12) {
                        System.out.println("Your are too young to buy this product(>teenagers) ");
                    }
                }else{
                    if (product.getAgeRestriction().equals(AGE_RESTRICTION_ADULT_ONLY)) {
                    if (customer.getAge() < 18) {
                        System.out.println("Your are too young to buy this product(adult only)");
                    }
                }else{
                        System.out.println("final");
                }
                }
            }
        }
    }
}
