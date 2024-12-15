public class BookstorePurchase {
    public static void main(String[] args) {
        int bookPrice = 150;
        int penPrice = 10;
        int notebookPrice = 25;

        int booksPurchased = 2;
        int pensPurchased = 5;
        int notebooksPurchased = 3;

        int totalCost = (bookPrice * booksPurchased) + (penPrice * pensPurchased) + (notebookPrice * notebooksPurchased);
        System.out.println("total cost:" +totalCost);

        double discountRate = 0.15;
        if (totalCost > 350) {
            double discount = totalCost * discountRate;
            System.out.println(discount);
            totalCost -= discount;
            System.out.println("total discount: " +totalCost);
        } else {
            System.out.println("walay discount: " + totalCost);
            
        }
    }
}
