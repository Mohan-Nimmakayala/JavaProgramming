import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        boolean isFestival = sc.nextBoolean();
        boolean isPremium = sc.nextBoolean();
        double discount = 0;
        
        if (amount >= 10000) discount = discount + (amount * 0.20);
        else if (amount >= 5000) discount = discount + (amount * 0.10);
        
        if (isFestival) discount = discount + (amount * 0.05);
        
        if (isPremium) discount = discount + 200;
        
        double payable = amount - discount;
        System.out.println(payable);
        sc.close();
    }
}
