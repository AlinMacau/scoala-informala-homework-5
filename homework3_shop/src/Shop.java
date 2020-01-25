public class Shop {
    public static void main(String[] args) {
        FoodProduct cigars = new FoodProduct("420 Blaze it fgt", 6.90, 1400, "adult");
        Customer pecata = new Customer("Pecata",17, 30.00);
        PurchaseManager.processPurchase(cigars, pecata);
        Customer gopeto = new Customer("Gopeto", 18, 0.44);
        PurchaseManager.processPurchase(cigars, gopeto);


    }
}