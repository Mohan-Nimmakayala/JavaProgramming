import java.util.*;
public class Grocery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        int quantity = sc.nextInt();
        double total = price * quantity;
        int result = (int)Math.floor(total);
        System.out.println(result);
        sc.close();
    }
}