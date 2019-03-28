public class Billing {

    public static double computeBill(double price){
        return price * 1.08;
    }

    public static double computeBill(double price, int quantity){
        return price * quantity * 1.08;
    }

    public static double computeBill(double price, int quantity, double coupon){
        return ((price * quantity)- coupon) * 1.08;
    }

    public static void main(String[] args){
        double price = 10.50;
        int quantity = 5;
        double coupon = 2.50;

        System.out.println("One photo book: $" + String.format("%.2f",computeBill(price)));

        System.out.println("\nFive photo books: $" + String.format("%.2f",computeBill(price, quantity)));

        System.out.println("\nFive photo books with coupon: $" +
                String.format("%.2f",computeBill(price, quantity, coupon)));

    }
}
