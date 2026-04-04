import java.util.*;

public class InterestMonths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double P = sc.nextDouble();// Principal
        double R = sc.nextDouble();// Rate
        int months = sc.nextInt();// Time in months

        double T = months / 12.0;// Convert to years

        // Simple Interest
        double SI = (P * R * T) / 100;
        double totalSI = P + SI;

        // Compound Interest
        double amount = P * Math.pow((1 + R / 100), T);
        double CI = amount - P;

        System.out.printf("Time in years = %.2f\n", T);

        System.out.printf("Simple Interest = %.2f\n", SI);
        System.out.printf("Total Amount (SI) = %.2f\n", totalSI);

        System.out.printf("Compound Interest = %.2f\n", CI);
        System.out.printf("Total Amount (CI) = %.2f\n", amount);
        sc.close();
    }
}