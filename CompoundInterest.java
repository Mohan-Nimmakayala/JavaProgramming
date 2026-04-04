import java.util.*;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double P = sc.nextDouble();
        double R = sc.nextDouble();
        double T = sc.nextDouble();
        double amount = P * Math.pow((1 + R / 100), T);
        double CI = amount - P;
        System.out.printf("Compound Interest = %.2f\n", CI);
        System.out.printf("Total Amount = %.2f\n", amount);
        sc.close();
    }
}