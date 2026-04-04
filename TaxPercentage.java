import java.util.Scanner;

public class TaxPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        
        if (income <= 10000) System.out.println("0%");
        else if (income <= 50000) System.out.println("10%");
        else if (income <= 100000) System.out.println("20%");
        else System.out.println("30%");
        
        sc.close();
    }
}
