import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double units = sc.nextDouble();
        boolean isSeniorCitizen = sc.nextBoolean();
        double bill = 0;
        
        if (units <= 100) bill = units * 1.50;
        else if (units <= 200) bill = (100 * 1.50) + ((units - 100) * 2.0);
        else if (units <= 300) bill = (100 * 1.50) + (100 * 2.0) + ((units - 200) * 3.0);
        else bill = 450 + ((units - 300) * 5.0);
        
        if (bill > 1000) bill = bill + (bill * 0.10);
        
        if (isSeniorCitizen) bill = bill - (bill * 0.05);
        
        System.out.println(bill);
        sc.close();
    }
}
