import java.util.*;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double P = sc.nextDouble();
        double R = sc.nextDouble();
        double T = sc.nextDouble();
        double SI = (P * R * T) / 100;
        double total = P + SI;
        System.out.printf("Simple Interest = %.2f\n", SI);
        System.out.printf("Total Amount = %.2f\n", total);
        sc.close();
    }
}